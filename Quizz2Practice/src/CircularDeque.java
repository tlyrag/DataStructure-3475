
public class CircularDeque<T> implements DequeInterFace<T>{
	int capacity;
	int size;
	int frontIndex;
	int backIndex;
	Object[] arr;
	
	@SuppressWarnings("unchecked")
	public CircularDeque() {
		this.capacity =20;
		this.size =0;
		this.arr = (T[]) new Object[capacity];
		this.frontIndex =0;
		this.backIndex=0;
		
	}

	@Override
	public void addFront(T entry) {
		
		
		checkCapacity();
		
		T key = entry;
		T temp = (T) this.arr[frontIndex];
		int index=0;
		
		if(frontIndex<=backIndex) {
			
			for(int i = frontIndex;i<backIndex;i++) {
				this.arr[i] = key;
				key = temp;
				temp = (T) this.arr[i+1];
			}
		} else {

			for(int i = frontIndex;i<this.arr.length;i++) {
				this.arr[i] = key;
				key = temp;
				temp = (T) this.arr[i+1];
			}
			for(int i =0;i<backIndex;i++) {
				this.arr[i] = key;
				key = temp;
				temp = (T) this.arr[i+1];
			}
		}
		this.size++;
		this.frontIndex++;
		this.backIndex++;
	}

	@Override
	public void addBack(T Entry) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T getFront() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getBack() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T removeFront() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T removeBack() {
		// TODO Auto-generated method stub
		return null;
	}
	public void checkCapacity() {
		if(this.size==this.capacity) {
			T temparr[] = (T[]) new Object();
			int index=0;
			
			if(frontIndex<backIndex) {
				
				
				for(int i = frontIndex;i<backIndex;i++) {
					temparr[index] = (T) this.arr[i];
					index++;
				}
			} else {

				for(int i = frontIndex;i<this.arr.length;i++) {
					temparr[index] = (T) this.arr[i];
					index++;
				}
				for(int i =0;i<backIndex;i++) {
					temparr[index] = (T) this.arr[i];
					index++;
				}
			}
		}
		
	}
}