package Stack;

public class ArrayStack<T>  implements StackInt<T>{
	T[] array;
	int capacity;
	int size;
	
	public ArrayStack() {
		this.capacity=20;
		this.size=0;
		this.array = (T[]) new Object[capacity];
	}
	@Override
	public void push(T Entry) {
		increaseSize();
		array[this.size] = Entry;
		size++;

	}

	@Override
	public T pop() {
		T popEntry = this.array[this.size];
		this.array[this.size]=null;
		this.size--;
		
		return popEntry;
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return this.array[this.size-1];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(this.size==0) {
			return true;
		}
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		this.array= (T[]) new Object[capacity];
	}

	@Override
	public void displayStack() {
		// TODO Auto-generated method stub
		for(int i =this.size; i>0;i--) {
			System.out.print(this.array[i-1]);
		}
	}
	public void increaseSize() {
		if(this.size== this.capacity) {
			T[] array = (T[]) new Object[capacity];
			
			for(int i=0;i<this.size;i++) {
				array[i] = this.array[i];
			}
			this.array= array;
		}
	}

}
