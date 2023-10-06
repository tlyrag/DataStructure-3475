import java.lang.reflect.Array;

public class MyList<T> implements ListInterface<T>{
	
	Object[] listTest;
	int length = 0;
	
	MyList() {
		this.listTest = new Object[0];
	}
	
	@Override
	public void push(T item) {
		T[] tempList = (T[]) new Object[this.length +1];
		for(int i =0;  i<listTest.length;i++) {
			tempList[i] = (T) listTest[i];
		}
		tempList[this.length] = item;
		
		this.length++;
		this.listTest=tempList;
	}

	@Override
	public void shift(T item) {
		// TODO Auto-generated method stub
		T[] tempList = (T[]) new Object[this.length +1];
		tempList[0] = item;
		for(int i =1;  i<=listTest.length;i++) {
			tempList[i] = (T) listTest[i-1];
		}
		this.length++;
		this.listTest=tempList;
	}

	@Override
	public void insert(T item, int index) {
		// TODO Auto-generated method stub
		T[] tempList = (T[]) new Object[this.length +1];
		
		for(int i =0;  i<index;i++) {
			tempList[i] = (T) listTest[i];
		}
		tempList[index] = item;
		
		for(int i =index; i<listTest.length;i++) {
			tempList[i+1] = (T) listTest[i];
		}
		this.length++;
		this.listTest=tempList;
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
	public void display(Object[] listTest, int first, int last) {
		// TODO Auto-generated method stub
		System.out.println(listTest[first]);
		if(first<last) {
			display(this.listTest,first+1,last);
		}
		;
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		display(this.listTest, 0, this.length-1);
	}



}
