package Queue;

import java.util.Vector;

public class VectorQueue<T> implements QueueInt<T> {
	Vector<T> vector = new Vector<>();
	int size;
	public VectorQueue() {
		this.size=0;
	}
	@Override
	public void enqueue(T Entry) {
		// TODO Auto-generated method stub
		vector.add(Entry);
		this.size++;
	}

	@Override
	public T dequeue() {
		T first = vector.get(0);
		vector.remove(0);
		this.size--;
		return first;
		
	}

	@Override
	public T getFront() {

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
		vector =  new Vector<>();
		
	}
	public void display() {
		for(int i=0;i<this.size;i++) {
			System.out.println(vector.get(i));
		}
	}

}
