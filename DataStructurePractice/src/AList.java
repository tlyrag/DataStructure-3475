
public class AList<T> implements ListInterface<T>{
	int current = 0;
	int capacity = 10;
	T[] array; 

	public AList() {
		this.array = (T[]) new Object[capacity];
	}
	@Override
	public void push(T item) {
		// TODO Auto-generated method stub
		try {
			if(!checkCapacity(1)) {
				increaseCapacity();
			}
			
			this.array[current]= item;
			current++;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error:" + e.getMessage());
		}
	
		
	}

	@Override
	public void shift(T item) {
		// TODO Auto-generated method stub
		try {
			if(!checkCapacity(1)) {
				increaseCapacity();
			}
			T key = item;
			for(int i =0; i<this.array.length;i++) {
				T temp  = this.array[i];
				this.array[i] = key;
				key = temp;
			}
			 
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error:" + e.getMessage());
		}
	}

	@Override
	public void insert(T item, int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pop(T item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unshift(T item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void length(T item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reverse(T item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sort(T item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void indexOf(T item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear(T item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		display(array, 0, this.array.length-1);
		
	}


	private void display(T[] arr, int first, int last) {
		// TODO Auto-generated method stub
		
		
		if(this.array[first]!=null) {
			System.out.println(this.array[first]);
		}
		if(first<last) {
			display(arr, first+1, last);
		} 
	}

	@Override
	public boolean checkCapacity(int increase) {
		// TODO Auto-generated method stub
		if(this.capacity<=this.current+increase) {
			return false;
		}
		return true;
	}
	
	public void increaseCapacity() throws Exception {
		int newCapacity = this.capacity*2;
		
		if(this.capacity>= this.maxCapacity) {
			
			throw new Exception("Maximum capacity already reached");
			
		} else if(newCapacity>this.maxCapacity) {
			
			this.capacity= this.maxCapacity;
		} else {
			this.capacity=newCapacity;
		}
		
		T[] tempArr = (T[]) new Object[capacity];
		
		for(int i =0;i<this.array.length;i++) {
			tempArr[i]= this.array[i];
		}
		
		this.array=tempArr;
	}

}
