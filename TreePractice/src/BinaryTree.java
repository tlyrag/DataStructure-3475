import java.util.ArrayList;

public class BinaryTree <T>{
	int height;
	int nodeCount;
	TreeNode root;
	ArrayList<TreeNode> treeList = new ArrayList<>();
	
	public BinaryTree() {
		this.height=0;
		this.nodeCount=0;
	}
	
	public boolean addNode(T data) {
		
		TreeNode newNode = new TreeNode(data,null,null);
		
		// Add the root if tree is empty
		if(root == null) {
			root = newNode;
			this.height++;
			this.nodeCount++;
			return true;
		}

		//Add root to queue
		treeList.add(root);
		
		// Iterate over Queue as LevelOrderTraverse to add node
		while(!treeList.isEmpty()) {
			TreeNode curr = treeList.get(0);
			
			// Check Left Node of current
			if(curr.left==null) {
				curr.left = newNode;
				treeList.clear();
				this.nodeCount++;
				this.height=(int) Math.log(height);
				return true;
			}
			// Check Right Node of current
			if(curr.right==null) {
				curr.right = newNode;
				treeList.clear();
				this.nodeCount++;
				this.height=(int) Math.log(height);
				return true;
			}
			
			// If Curr Node is full, remove from queue and add the child to queue
			treeList.remove(0);
			treeList.add(curr.left);
			treeList.add(curr.right);
			
		}
		
		return false;
		
		
	}
	
	public void preOrder(TreeNode node) {
		
		System.out.print(node.data+" ");
		
		if(node.left!=null) {
			preOrder(node.left);
		}
		
		if(node.right!=null) {
			preOrder(node.right);
		}
		
	}
	
	public void inOrder(TreeNode node) {
		
		if(node.left!=null) {
			inOrder(node.left);
		} 
			System.out.print(node.data+ " ");
		
		if(node.right!=null) {
			inOrder(node.right);
		} 
	}
	
	public void postOrder(TreeNode node) {
		if(node.left!=null) {
			postOrder(node.left);
		} 
			
		if(node.right!=null) {
			postOrder(node.right);
		} 
		
		System.out.print(node.data+ " ");
	}
}
