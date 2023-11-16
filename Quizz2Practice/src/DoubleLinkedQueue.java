
public class DoubleLinkedQueue<T> implements QueueInt<T>{
	
	int frontIndex;
	int backIndex;
	int capacity;

	int size;
	Node head;
	Node tail;
	
	public DoubleLinkedQueue() {
		this.frontIndex=-1;
		this.backIndex=-1;
		this.capacity=20;
		this.size=0;
	}
	
	
	@Override
	public void enqueue(T Entry) {
		Node newNode = new Node(Entry);
		
		if(head == null) {
			head =newNode;
			tail = head;
			return;
		}
		Node curr = head;
		
		while(curr.Next!=null) {
			curr= curr.Next;
		}
		
		curr.Next = newNode;
		newNode.Previous = curr;
		tail = newNode;
		this.size+=1;
	}

	@Override
	public T dequeue() {
		Node key = tail;
		tail= key.Previous;
		tail.Next =null;
	
		
		
		return (T) key.Data;
	}

	@Override
	public T getFront() {
		
		return (T) head;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	
	public void displayQueue() {
		Node curr = head;
		while(curr!=null) {
			System.out.println(curr.Data);
			curr = curr.Next;
		}
		this.size-=1;
			
	}
	
	public void displayQueueBack() {
		Node curr = tail;
		while(curr!=null) {
			System.out.println(curr.Data);
			curr = curr.Previous;
		}
			
	}



}
