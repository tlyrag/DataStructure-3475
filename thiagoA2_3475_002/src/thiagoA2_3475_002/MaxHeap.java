package thiagoA2_3475_002;

public class MaxHeap<T extends Comparable<T>> implements HeapInterface<T> {
	
	T[] heap;
	int capacity;
	int lastIndex;
	int height;
	int nodes;
	
	public MaxHeap (){
		this.capacity=20;
		this.heap = (T[]) new Comparable[capacity];
		this.height=0;
		this.nodes=0;
		this.lastIndex=0;
				
	}
	/**
	 *@author tlyra
	 *
	 * Adds an entry to the heap and perform a reheap to order the MaxHeap
	 */
	@Override
	public void add(T newEntry) {
		checkCapacity();
		
		if(nodes==0) {
			this.heap[1]= newEntry;
			nodes++;
			lastIndex=2;
			return;
		}
		
		int parentIndex = lastIndex/2;
		int currIndex = lastIndex;
		while(parentIndex>0 && newEntry.compareTo(heap[parentIndex])>0 ) {
			
			heap[currIndex]=heap[parentIndex];
			currIndex=parentIndex;
			parentIndex=currIndex/2;
			
		}
		heap[currIndex]=newEntry;
		nodes++;
		lastIndex++;
		
		
	}
	/**
	 *@author tlyra
	 *
	 * Remove the biggest entry and replace with the most right leaf.
	 * perform reheaps until the tree becomes a MaxHeap again
	 */
	@Override
	public T removeMax() {
		T max = this.heap[1];
		this.heap[1] = this.heap[lastIndex-1];
		this.heap[lastIndex-1]=null;
		int currIndex=1;
		int rightIndex= currIndex*2+1;
		int leftIndex=currIndex*2;
		boolean isDone =false;

		while(this.heap[leftIndex]!=null && !isDone) {
			
			if(this.heap[rightIndex]==null) {
				if (this.heap[leftIndex].compareTo(this.heap[currIndex])>0) {
					T temp = this.heap[currIndex];
					this.heap[currIndex] = this.heap[leftIndex];
					this.heap[leftIndex]= temp;
					currIndex= leftIndex;
				}else {
					isDone = true;
				}
			}
			else if(this.heap[leftIndex].compareTo(this.heap[rightIndex])>0 && this.heap[leftIndex].compareTo(this.heap[currIndex])>0) {
				T temp = this.heap[currIndex];
				this.heap[currIndex] = this.heap[leftIndex];
				this.heap[leftIndex]= temp;
				currIndex= leftIndex;
				
			} else if(this.heap[leftIndex].compareTo(this.heap[rightIndex])<0 && this.heap[rightIndex].compareTo(this.heap[currIndex])>0) {
				T temp = this.heap[currIndex];
				this.heap[currIndex] = this.heap[rightIndex];
				this.heap[rightIndex]= temp;
				currIndex=rightIndex;
			} else {
				isDone = true;
			}
			
			rightIndex= currIndex*2+1;
			leftIndex=currIndex*2;
		}
		lastIndex--;
		nodes--;
		return max;
	}
	
	/**
	 * @author tlyra
	 * @param get the first element(Biggest) of the max Heap 
	 * 
	 */
	@Override
	public T getMax() {
		if(!isEmpty()) {
			return heap[1];
		}
		return null;
	}
	/**
	 * @author tlyra
	 * @param Checks if the MaxHeap is empty
	 * 
	 */
	@Override
	public boolean isEmpty() {
		if(this.lastIndex<1) {
			return true;
		}
		return false;
	}
	/**
	 * @author tlyra
	 * @param returns the qtd of itens in the heap
	 * 
	 */
	@Override
	public int getSize() {
		
		return lastIndex;
	}
	/**
	 * @author tlyra
	 * @param Clear the heap by assigning all values to null
	 * 
	 */
	@Override
	public void clear() {
		for(int i=0;i<heap.length;i++) {
			this.heap[i]=null;
		}
		this.lastIndex=0;
	}
	
	/**
	 * @author tlyra
	 * @param Check if the array needs to be increased
	 * and increase if needed
	 * 
	 */
	public void checkCapacity() {
		
		if(this.capacity==this.lastIndex) {
			this.capacity+=20;
			T[] tempHeap = (T[]) new Comparable[this.capacity];
			
			for(int i =0;i<this.heap.length;i++) {
				tempHeap[i]=this.heap[i];
			}
			this.heap=tempHeap;
		}
	}
	
	/**
	 * @author tlyra
	 * @param Display the heap in level order
	 * 
	 */
	public void displayHeap() {
		for(int i =1;i<this.lastIndex;i++) {
			System.out.print(this.heap[i]+" ");
		}
	}

}
