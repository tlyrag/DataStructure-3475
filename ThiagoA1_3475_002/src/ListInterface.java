
public interface ListInterface<T> {
	
	public void add(T newEntry);
	public void add(int newPosition,T newEntry);
	public void remove(int givenPosition);
	public void clear();
	public void replace(int givenPosition, T newEntry);
	public T getEntry(int givenPosition);
	public T[] toArray();
	public boolean contains(T anEntry);
	public int getLength();
	public boolean isEmpty();
	
}
