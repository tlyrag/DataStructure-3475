package Queue;

public class ArrayQueue<T> implements QueueInt<T> {
	int capacity;
	int size;
	T[] array = (T[]) new Object[capacity];
	
	public ArrayQueue() {
	 this.capacity=20;
	 this.size=0;
	 this.array = (T[]) new Object[capacity];
	}
	public void checkCapacity() {
		if(this.size==this.capacity) {
			this.capacity+=20;
			T[] temp =(T[]) new Object[capacity];
			
			for(int i =0;i<this.size;i++) {
				temp[i]=array[i];
			}
			this.array=temp;
		}
	}
	
	@Override
	public void enqueue(T Entry) {
		checkCapacity();
		this.array[this.size]=Entry;
		this.size++;
	}

	@Override
	public T dequeue() {
		T first = this.array[0];
		for(int i =0;i<this.size;i++) {
			this.array[i] = this.array[i+1];
		}
		this.size--;
		return first;
	}

	@Override
	public T getFront() {
		// TODO Auto-generated method stub
		return this.array[0];
	}

	@Override
	public boolean isEmpty() {
		if(this.size==0) {
			return true;
		}
		return false;
	}

	@Override
	public void clear() {
		this.array= (T[]) new Object[this.capacity];
	}
	public void displayQueue() {
		for(int i =0;i<this.size;i++) {
			System.out.print(this.array[i]+ " ");
		}
	}
}
