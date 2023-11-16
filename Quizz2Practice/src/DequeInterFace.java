
public interface DequeInterFace<T> {
	public void addFront(T entry);
	public void addBack(T Entry);
	public T getFront();
	public T getBack();
	public T removeFront();
	public T removeBack();
}
