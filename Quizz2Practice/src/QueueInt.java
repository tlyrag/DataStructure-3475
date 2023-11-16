

public interface QueueInt <T>{
	public  void enqueue(T Entry);
	public  T dequeue();
	public  T getFront();
	public boolean isEmpty();
	public void clear();

}
