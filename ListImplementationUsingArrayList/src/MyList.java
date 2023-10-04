
import java.util.*;
/**
 * MyList class implementation of List ADT 
 * @author mbashir1
 *
 * @param <T>
 */
public class MyList<T> implements MyListInterface<T>{
	List<T> myList;
	
	public MyList() {
		myList = new ArrayList<>();
	}
	
	@Override
	public void add(T newEntry) {
		// TODO Auto-generated method stub
		myList.add(newEntry);
	}

	@Override
	public void add(int newPosition, T newEntry) {
		// TODO Auto-generated method stub
		myList.add(newPosition,newEntry);
	}

	@Override
	public T remove(int givenPosition) {
		// TODO Auto-generated method stub
		T obj = myList.remove(givenPosition);
		return obj;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		myList.clear();
	}

	@Override
	public T replace(int givenPosition, T newEntry) {
		// TODO Auto-generated method stub
		T obj =myList.set(givenPosition, newEntry);
		return obj;
	}

	@Override
	public T getEntry(int givenPosition) {
		// TODO Auto-generated method stub
		return myList.get(givenPosition);
	}

	@SuppressWarnings("unchecked")
	@Override
	public T[] toArray() {
		// TODO Auto-generated method stub
		Object[] myArray = (Object[]) myList.toArray();
		return (T[]) myArray;
	}

	@Override
	public boolean contains(T anEntry) {
		// TODO Auto-generated method stub
		boolean contains = myList.contains(anEntry);
		return contains;
	}

	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return myList.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return myList.isEmpty();
	}

}
