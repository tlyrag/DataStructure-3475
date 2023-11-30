package thiagoA2_3475_002;
import java.util.*;
public class KthLargestApp {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		//int[] arr = {20,40,30,10,90,70};
		int[] userArray =getUserInput();
		int k = getUserKValue(userArray);
		int[] kThArr =getKthNumbers(userArray,k);
		System.out.println("Your first "+ k +" biggest numbers are: " ); 
		displayArr(kThArr);
		
		
		
		
	}
	/**
	 * @author tlyra
	 *
	 * @param gets user input and treat if it is not in the right format
	 * also returns an array of number that is created based on the user input
	 */
	public static int[] getUserInput() {
		
		try {
			System.out.print("Please enter list of number. ex:1,2,3,4,5,6: ");
			String list = input.nextLine();
			String[] arr = list.split(",");
			int[] finalInt = new int[arr.length];
			for(int i=0;i<arr.length;i++) {
				int temp =Integer.parseInt(arr[i]);
				finalInt[i]=temp;
			}
			return finalInt;
			
		} 
		catch (Exception e) {
			System.out.println("Invalid format entered. The list should be numbers separated by ',' ");
			System.out.println("Ex: 1,2,3,4,5,6");
			return getUserInput();
		}
	}
	/**
	 * @author tlyra
	 *
	 * @param gets user input and treat if it is not in the right format
	 * returns an integer of the K number of element to be used on the app
	 */
	public static int getUserKValue(int arr[]) {
		try {
			System.out.print("Please enter the number of elements you want. It should be between 0 and "+ arr.length+" :" );
			int k  =Integer.parseInt(input.nextLine());
			if(k>arr.length) {
				throw new Exception(k+ " should be lesser than " + arr.length);
			}
			return k;
			
		} 
		catch (Exception e) {
			System.out.println("Invalid format entered. Please enter an Integer");
			
			return getUserKValue(arr);
		}
	}
	
	/**
	 * @author tlyra
	 *
	 * @param gets the Kth biggest elements inside the heap
	 */
	public static int[] getKthNumbers(int[] arr, int k) {
		MaxHeap<Integer> heap = new MaxHeap<>();
		for(int i=0;i<arr.length;i++) {
			heap.add(arr[i]);
		}
		int[] kthArray = new int[k];
		for(int i =0; i<k;i++) {
			kthArray[i] = heap.removeMax();
		}
		return kthArray;
		
	}
	
	public static void displayArr(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
//	public static void testHeap(int[] arr) {
//		MaxHeap<Integer> heap= new MaxHeap<>();
//		for(int i =0;i<arr.length;i++) {
//			heap.add(arr[i]);
//		}
//		
//		heap.displayHeap();
//		heap.add(100);
//		System.out.println(" ");
//		heap.displayHeap();
//		System.out.println(" ");
//		System.out.println(heap.removeMax());
//		System.out.println(" ");
//		heap.displayHeap();
//		
//		
//	}
}
