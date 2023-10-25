package Queue;

public class LinkedQueue<T> implements QueueInt<T> {
	
	Node head;
	int size;
	
	public LinkedQueue() {
		int size=0;
	}
	
	@Override
	public void enqueue(T Entry) {
		Node newNode = new Node();
		newNode.Data = Entry;
		if(head==null) {
			head=newNode;
			size++;
			return;
		} 
			
		Node curr=head;	
		while(curr.next!=null) {
			curr = curr.next;
		}
		curr.next = newNode;
		size++;
		return;
		
	}

	@Override
	public T dequeue() {
		Node first = head;
		head = head.next;
		size--;
		return (T) first.Data;
	}

	@Override
	public T getFront() {
		return (T)head.Data;
	}

	@Override
	public boolean isEmpty() {
		if(size==0) {
			return true;
		}
		return false;
	}

	@Override
	public void clear() {
		head=null;
		
	}
	public void displayQueue() {
		Node curr = head;
		while(curr!=null) {
			System.out.print(curr.Data+" ");
			curr = curr.next;
		}
	}
	
}
