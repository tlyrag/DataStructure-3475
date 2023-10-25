package AppTraining;

public interface QueueInterface<T> {
	public void enqueue(T entry);
	public T dequeue();
	public T peek();
	public boolean checkCapacity();
	
}
