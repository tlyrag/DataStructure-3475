
public class TreeNode<T> {
	T data;
	TreeNode left;
	TreeNode right;
	TreeNode root;
	
	
	TreeNode(T data,TreeNode left, TreeNode right) {
		this.data = data;
		this.left=left;
		this.right=right;
	}
	
	
	public void setLeft(TreeNode tree) {
		this.left=tree;
	}
	
	public void setRight(TreeNode tree) {
		this.right=tree;
	}
	public void setRoot(TreeNode tree) {
		this.root=tree;
	}

}

