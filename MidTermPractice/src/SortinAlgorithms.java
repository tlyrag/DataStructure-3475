
public class SortinAlgorithms {
	public static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		//int[] arr = {5,5,9,4,10,8,9,0,1,1,2,3,6,7,1,3,4,1,2,3,5,1,2,3,5,1,23,45,5,12,512};
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		//System.out.println("Min Number is:" +findMin(arr));
		//System.out.println("Min Number is:" +recurrsiveFindMin(arr,0,arr.length-1));
		//insertionSort(arr);
		insertionSort(arr);
		//SelectionSort(arr);
		//int a = recursionSearch(7,arr,0,arr.length-1);
		
		//System.out.println();
		//System.out.println(a);
		
		System.out.print("Sorted Array: ");
		displayArr(arr,0,arr.length-1);
		int index =binarySearch(512, arr, 0, arr.length-1);
		System.out.println();
		System.out.println("Array Length:"+ arr.length);
		System.out.println();
		System.out.println("Index Found:" + index + " Runtime:"+count);
	}
	
	
	public static void insertionSort(int[] arr) {
		if(arr ==null) {
			return;
		} 
		if(arr.length==1) {
			return;
		}
		for(int i =0; i<arr.length;i++) {
			int minIndex = recurrsiveFindMin(arr,i,arr.length-1);
			//System.out.println(i+" Iteration Minimum Index is:" + minIndex + " Min:"+ arr[minIndex] );
			swap(arr,i,minIndex);//
		}	
	}
	
	
	
	public static int recurrsiveFindMin(int[] arr,int first, int last) {
		int mid = (first+last)/2;
		int min;
		count++;
		if(first==last) {
			
			return first;
		} else {
			int MinA = recurrsiveFindMin(arr, first, mid);
			int MinB = recurrsiveFindMin(arr, mid+1, last);
			
			if(arr[MinA]<arr[MinB]) {
				return MinA;
			} else {
				return MinB;
			}
		}
	}
	
	public static void swap(int[] arr,int a, int b) {
		int c = arr[a];
		arr[a] = arr[b];
		arr[b]=c;
	}

	/**
	 * 
	 * 
	 * */
	
	public static void SelectionSort(int arr[]) {
		
		for(int i =0;i<arr.length-1;i++) {
			int curr = i+1;
			int prev = i;
		
			while(prev>=0 && arr[curr]<arr[prev]) {
				swap(arr,curr,prev);
				curr = prev;
				prev =curr-1;
				count++;
			}
		}
	}
	/**
	 * 
	 * 
	 * */
	
	public static int recursionSearch(int key ,int[] arr, int first, int last) {
		int mid = (first+last)/2;
		int index = -1;
		if(first==last) {
			
			if(arr[first]==key) {
				index = first;

			} 
			return index;
		}
		if(index==-1) {
			index  = recursionSearch(key, arr, first, mid);
		}
		if(index ==-1) {
			index = recursionSearch(key, arr, mid+1, last);
		}
		return index;
	}
	public static void displayArr(int[] arr, int first, int last) {
	
		System.out.print(arr[first] + " ");
		if(first<last) {
			displayArr(arr, first+1, last);
		}
	}
	
	public static int binarySearch(int key,int[] arr, int first, int last) {
		int index =-1;
		if(first==last) {
			if(arr[first]==key) {
				index = first;
			}
			return index;
		} else {
			int mid = (first+last)/2;
			
			if(arr[mid]==key) {
				return mid;
			} else if(arr[mid]>key) {
				return binarySearch(key, arr, first, mid);
			} else {
				return binarySearch(key, arr, mid+1, last);
			}
		}
	}
	
}

