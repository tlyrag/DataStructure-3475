
public class LinkedList<T>  implements MyListInterface<T>{
	
	Node head;
	int size;
	

	@Override
	public void add(T newEntry) {
		// TODO Auto-generated method stub
		if(head == null) {
			head = new Node(0,null,newEntry);
			size = 0;
			
		} else {
			
			Node newNode = new Node(newEntry);
			Node curr = head;
			
			while(curr!=null) {
				
				if(curr.next== null) {
					curr.next= newNode;
					newNode.index= curr.index+1;
					return;
				} else {
					curr = curr.next;
				}
			}
			
		}
		
	}
	
	public void displayList() {
		Node curr = head;
		while(curr!=null) {
			System.out.println(curr.data);
			curr = curr.next;
			
		}
	}
	
	
	

	@Override
	public void add(int newPosition, T newEntry) throws Exception {
		// TODO Auto-generated method stub
		Node newNode = new Node(newEntry);
		
		
		Node previous = head;
		Node curr = head.next;
		
		if(previous == null || curr ==null) {
			throw new Exception(" Error ");
		}
		for(int i=0; i<newPosition;i++) {
			
		}
		
	}

	@Override
	public T remove(int givenPosition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T replace(int givenPosition, T newEntry) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getEntry(int givenPosition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contains(T anEntry) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
}
