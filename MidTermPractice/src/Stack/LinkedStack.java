package Stack;

public class LinkedStack <T> implements StackInt<T>{

	Node head;
	int size;
	
	public LinkedStack() {
		// TODO Auto-generated constructor stub
		this.size=0;
	}
	
	@Override
	public void push(T Entry) {
		// TODO Auto-generated method stub
		Node newNode = new Node<T>(Entry);
		
		if(head==null) {
			head = newNode;
			size++;
		} else {
			Node temp = head;
			head = newNode;
			head.next=temp;
			size++;
		}
	}

	@Override
	public T pop() {
		Node first = head;
		if(head.next!=null) {
			head = head.next;
			size--;
		}
		
		return (T) first.data;
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		if(!isEmpty()) {
			return (T) head.data;
		}
		return null;
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(head==null) {
			return true;
		}
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		head=null;
		size=0;
		
	}

	@Override
	public void displayStack() {
		// TODO Auto-generated method stub
		
		if(isEmpty()) {
			System.out.println("Empty Stack");
		} else {
			for(int i=0;i<size;i++) {
				Node curr = head;
				System.out.print(curr.data);
				curr = curr.next;
			}
		}
		
	}

}
