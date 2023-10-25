package List;
/**
 * MyListInterface
 * @author mbashir1
 *
 * @param <T>
 */
public interface MyListInterface<T> {
	public void add(T newEntry);
	public void add(int newPosition, T newEntry);
	public T remove(int givenPosition);
	public void clear();
	public T replace(int givenPosition, T newEntry);
	public T getEntry(int givenPosition);
	public T[] toArray();
	public boolean contains(T anEntry);
	public int getLength();
	public boolean isEmpty();
}
