
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,7,9,4,2,1,0};
		insertionSort(arr, 0, arr.length-1);
		displayArr(arr, 0, arr.length-1);
	}
	public static void displayArr(int[] arr,int first, int last) {
		System.out.print(arr[first] + " ");
		if(first<last) {
			displayArr(arr, first+1, last);
		}
	}
	
	public static void swap(int[] arr,int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second]= temp;
	}
	public static int findMin(int[] arr,int first,int last) {
		int mid = (first+last)/2;
		
		if(first==last) {
			return first;
		} else {
			int MinA = findMin(arr, first, mid);
			int MinB = findMin(arr, mid+1, last);
			
			if(arr[MinA]<arr[MinB]) {
				return MinA;
			} else {
				return MinB;
			}
		}
	}
	public static void insertionSort(int[] arr, int first, int last) {
		for(int i =0;i<arr.length;i++) {
			int minIndex = findMin(arr, i, last);
			swap(arr, i, minIndex);
		}
	}
	
}
