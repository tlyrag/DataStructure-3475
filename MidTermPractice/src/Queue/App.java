package Queue;

public class App {

	public static void main(String[] args) {
		System.out.println("Linked List");
		
		linkedQueueTest();
		
		System.out.println("Array List");
		arrayQueueTest();
		System.out.println("Vector List");
		vectorQueueTest();
		
	}
	
	public static void linkedQueueTest() {

		LinkedQueue<Integer> queue = new LinkedQueue<>();
		queue.enqueue(0); 
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(queue.dequeue());
		queue.dequeue();
		queue.enqueue(14);
		queue.dequeue();
		int a =queue.getFront();
		System.out.println(a);
		queue.displayQueue();
	}
	public static void arrayQueueTest() {
		ArrayQueue<Integer> queue = new ArrayQueue<>();
		queue.enqueue(0); 
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(queue.dequeue());
		queue.dequeue();
		queue.enqueue(14);
		queue.dequeue();
		int a =queue.getFront();
		System.out.println(a);
		queue.displayQueue();
	}
	
	public static void vectorQueueTest() {
		VectorQueue<Integer> queue = new VectorQueue<>();
		queue.enqueue(0); 
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(queue.dequeue());
		queue.dequeue();
		queue.enqueue(14);
		queue.dequeue();
		int a =queue.getFront();
		System.out.println(a);
		queue.display();
	}

}
