package Stack;

import java.util.Vector;

public class VectorStack<T> implements StackInt<T>{

	Vector<T> vector = new Vector<>();
	int size;
	
	public VectorStack() {
		this.size = 0;
	}
	
	@Override
	public void push(T Entry) {
		// TODO Auto-generated method stub
		T key = Entry;
		if(this.size==0) {
			vector.add(key);
			this.size++;
		} else {
			this.size++;
			vector.add(0, key);
		}		
		
		
	}

	@Override
	public T pop() {
		T popedEntry = vector.get(0);
		vector.remove(0);
		this.size--;
		return popedEntry;
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return vector.get(0);
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
		Vector<T> vector = new Vector<>();
	}

	@Override
	public void displayStack() {
		for(int i =0;i<this.size;i++) {
			System.out.println(vector.get(i));
		}
		
	}

}
