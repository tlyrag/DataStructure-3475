import java.util.ArrayList;

public class BinarySearchTree {
	
	int height;
	int nodeCount;
	TreeNode root;
	ArrayList<TreeNode> treeList = new ArrayList<>();
		
	public BinarySearchTree() {
		this.height=0;
		this.nodeCount=0;
		
	}
	
	public void addNode(int entry) {
		TreeNode newNode = new TreeNode(entry, null, null);
		
		if(root == null) {
			root = newNode;
			this.height++;
			this.nodeCount++;
			return;
		}
		TreeNode curr = root;
		
		
		boolean isAdded = false;
		
		while(!isAdded) {
			// Comparing with curr
			if((int)curr.data>entry) {
				//Checking if it is Empty
				if(curr.left==null) {
					curr.left=newNode;
					isAdded=true;
					this.nodeCount++;
					this.height= (int)Math.log(nodeCount);
					//Not empty then move to next node
				} else {
					curr = curr.left;
				}
			} else {
				if(curr.right==null) {
					curr.right=newNode;
					isAdded=true;
					this.nodeCount++;
					this.height= (int)Math.log(nodeCount);
					//Not empty then move to next node
				} else {
					curr = curr.right;
				}
			}
		}
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
