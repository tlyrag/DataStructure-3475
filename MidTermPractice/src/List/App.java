package List;

public class App {
	public static void main(String args[]) {
		testLinkedList();
	}
	public static void testLinkedList() {
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(1);
		list.add(1);
		list.add(1);
		list.display();
	}

}
