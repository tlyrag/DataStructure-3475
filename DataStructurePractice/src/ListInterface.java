
public interface ListInterface <T>{
	public final int maxCapacity = 250;
	public void push(T item);
	public void shift(T item);
	public void insert(T item,int index);
	public void pop(T item);
	public void unshift(T item);
	public void length(T item);
	public void reverse(T item);
	public void sort(T item);
	public void indexOf(T item);
	public void clear(T item);
	public void display();
	//public void display(T[] arr, int first, int last);

	public boolean checkCapacity(int increase);
	
}
