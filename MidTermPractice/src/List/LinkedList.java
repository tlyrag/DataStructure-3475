package List;

import javax.swing.text.html.parser.Entity;

public class LinkedList<T>implements  MyListInterface<T>{
	Node head;
	int size;
	
	public LinkedList() {
		this.size=0;
	}
	@Override
	public void add(T newEntry) {
		Node newNode = new Node(newEntry);
		this.size++;
		if(head==null) {
			this.head=newNode;
			return;
		}
		Node curr=head;
		
		while(curr.next!=null) {
			curr = curr.next;
		}
		curr.next = newNode;
		
		
	}
	@Override
	public void add(int newPosition, T newEntry) {
		
		if(newPosition>this.size) {
			System.out.println("Cannot add an item");
			return;
		} 
		Node newNode = new Node(newEntry);
		Node prev = head;
		Node curr = prev.next;
		Node next= curr.next;
		int i=0;
		
		while(i<newPosition) {
			i++;
			
			
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
	public  void display() {
		Node curr = head;
		for(int i=0;i<this.size;i++) {
			System.out.print(curr.Data);
			curr=curr.next;
		}
	}
	
	
}
