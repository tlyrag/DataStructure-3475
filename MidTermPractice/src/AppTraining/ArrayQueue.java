package AppTraining;

public class ArrayQueue<T> implements QueueInterface<T> {
	int capacity;
	T[] arr;
	int size;
	public ArrayQueue() {
		this.size=0;
		this.capacity=20;
		this.arr=(T[]) new Object[capacity];
	}
	@Override
	public void enqueue(T entry) {
		checkCapacity();
		arr[this.size]=entry;
		this.size++;
		
	}

	@Override
	public T dequeue() {
		T data = arr[0];
		for(int i =0;i<this.size;i++) {
			arr[i]= arr[i+1];
		}
		this.size--;
		return data;
	}

	@Override
	public T peek() {
		
		return arr[this.size];
	}

	@Override
	public boolean checkCapacity() {
		if(this.size<this.capacity) {
			return true;
		}
		this.capacity*=2;
		T[] tempArr = (T[]) new Object[capacity];
		
		for(int i =0; i<this.size;i++) {
			tempArr[i] = arr[i];
		}
		arr = tempArr;
		return false;
	}

}
