
public class App {

	public static void main(String[] args) {
		//CicrcularQueueTest();
		CircularVoidTest();
	}
	
	public static void CicrcularQueueTest() {
		DoubleLinkedQueue<Integer> queue = new DoubleLinkedQueue<>();
		queue.enqueue(0);
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		//queue.displayQueue();
		//queue.displayQueueBack();
		int a = queue.dequeue();
		System.out.println(a);
		queue.displayQueue();
		
	}
	public static void CircularVoidTest() {
		CircularDeque<Integer> deck = new CircularDeque<>();
		deck.addFront(0);
		deck.addFront(1);
		deck.addFront(2);
		deck.addFront(3);
		
		
	}

}
