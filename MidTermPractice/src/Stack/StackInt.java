package Stack;

public interface StackInt<T> {
	public abstract void push(T Entry);
	public abstract T pop();
	public abstract T peek();
	public abstract boolean isEmpty();
	public abstract void clear();
	public abstract void displayStack();
}
