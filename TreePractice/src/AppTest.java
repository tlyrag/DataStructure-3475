
public class AppTest {
	
	public static void main(String args[]) {
//		testBTree(10);
//		int a = Integer.parseInt("2");
//		testBinarySearchTree();
		testBinarySearchTree();
	}
	
	public static void testBTree(int treeNodeCount) {
		BinaryTree<Integer> tree = new BinaryTree<>();
		
		for(int i =0;i<treeNodeCount;i++) {
			tree.addNode(i);
		}
		
		
		System.out.println("Pre Order Traverse"); 
		tree.preOrder(tree.root);
		System.out.println(""); 
		System.out.println("In Order Traverse");
		tree.inOrder(tree.root);
		System.out.println(""); 
		System.out.println("Post Order Traverse");
		tree.postOrder(tree.root);
	}
	public static void testBinarySearchTree() {
		BinarySearchTree tree = new BinarySearchTree();
		tree.addNode(10);
		tree.addNode(8);
		tree.addNode(11);
		tree.addNode(114);
		tree.addNode(32);
		tree.addNode(5);
		tree.addNode(7);
		tree.addNode(9);
		tree.preOrder(tree.root);
	}
	
	
	

}