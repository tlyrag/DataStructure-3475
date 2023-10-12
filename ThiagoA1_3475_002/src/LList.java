
public class LList <T> implements ListInterface<T>{
	
	Node head;
	int listSize =0;

	@Override
	public void add(T newEntry) {
		// TODO Auto-generated method stub
		Node newNode = new Node(newEntry);
		
		if(this.head == null) {
			head = newNode;
			this.listSize++ ;
		} else {
			Node curr= head;
			
			while(curr!=null) {
				if(curr.next==null) {
					curr.next=newNode;
					this.listSize++ ;
					return;
				} else {
					curr= curr.next;
				}
			}
		}
	}

	@Override
	public void add(int newPosition, T newEntry) {
		// TODO Auto-generated method stub
		
		Node prev = head;
		Node curr = head.next;
		Node newNode = new Node(newEntry);
	    
		if(newPosition>this.listSize) {
			System.out.println("Position is greater than current list size, entry not added");
			return;
		}
		
		if(newPosition ==0) {
			head = newNode;
			head.next= prev;
			this.listSize++;
			return;
		}
		
		for(int i =1; i<newPosition; i++) {
			curr = curr.next;
			prev = prev.next;
		}
		
		prev.next=newNode;
		newNode.next=curr;
		this.listSize++;
		return;
		
	
	}

	@Override
	public void remove(int givenPosition) {
		// TODO Auto-generated method stub
		Node prev = head;
		Node curr = head;
		Node next = head;
		
		if(givenPosition>=this.listSize) {
			System.out.println("Given Position has a Null Element");
			return;
		}
		
		if(givenPosition==0) {
			curr = head.next;
			head = curr;
			this.listSize--;
			return;
		}
		
		curr = prev.next;
		next = curr.next;
		
		for(int i =1; i< givenPosition;i++) {
			curr = curr.next;
			prev = prev.next;
			next = next.next;
		}
		this.listSize--;
		prev.next=next;
		return;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		this.head = null;
		this.listSize=0;
	}

	@Override
	public void replace(int givenPosition, T newEntry) {
		// TODO Auto-generated method stub
		Node newNode = new Node(newEntry);
		Node curr = head;
		
		if(givenPosition>= this.listSize) {
			System.out.println("No element at this given position");
			return;
		}
		
		
		for(int i= 0;i<givenPosition;i++) {
			curr = curr.next;
		}
		curr.data=newEntry;
		
		
	}

	@Override
	public T getEntry(int givenPosition) {
		Node curr = head;
		
		for(int i =0; i<givenPosition;i++) {
			curr= curr.next;
		}
		return (T) curr.data;
	}

	@Override
	public T[] toArray() {
		// TODO Auto-generated method stub
		T[] Array = (T[]) new Object[listSize];
		Node curr = head;
		for(int i=0;i<this.listSize;i++) {
			Array[i] = (T) curr.data;
			curr = head.next;
		}
		
		return Array;
	}

	@Override
	public boolean contains(T anEntry) {
		Node curr = head;
		int i = 0;
		boolean found =false;
		
		while(!found && i<this.listSize) {
			
			if(curr.data.equals(anEntry)) {
				return true;
			}
			i++;
			curr=curr.next;
			
		}
		return false;
	}

	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return this.listSize;
	}

	@Override
	public boolean isEmpty() {
		if(this.listSize==0) 
			return false;
		else 
			return true;
	}

	/**
	 * 
	 * @author tlyra
	 * Display method that will be used in recursion to display all elements in the array
	 * */
	private void displayList(Node node) {
		System.out.println(node.data);
		
		if(node.next!=null) {
			displayList(node.next);
		}
	}
	
	public void displayList() {
		if(head!=null) {
			displayList(head);
		}
		else {
			System.out.println("null");
		}
	}
}
