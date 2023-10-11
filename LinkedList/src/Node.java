
public class Node<T> {
	int index;
	T data;
	Node next;
	Node Tail;
	
	Node(int index, Node next, T data) {
		this.index=index;
		this.next = next;
		this.data = data;
	}
	
	Node(int index, T data) {
		this.index=index;
		this.data = data;
	}
	Node(T data) {
		this.data = data;
	}
	
}
