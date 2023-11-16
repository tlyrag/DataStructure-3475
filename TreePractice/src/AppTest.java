
public class AppTest {
	
	public static void main(String args[]) {
		testBTree(10);
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
	
	
	

}