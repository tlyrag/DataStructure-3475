import java.util.Scanner;
public class SearchAlgorithm {
	public static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) throws TestException {
		// TODO Auto-generated method stub
		
		int[] arr = {7,14,24,3,1,2,3,4,5,6,7,8};
		//int index = indexOf(arr,56,0,arr.length-1);
		//System.out.println("Sequential Search:" +index);
		//int index = binarySearch(arr,6,0,arr.length-1);
		//System.out.println("Binary Search - index is:" + index +" Number found:" + arr[index]);
		
		SelectionSort(arr,0,arr.length-1);
		displayArr(arr,0,arr.length-1);
		try {
			throw(new TestException());	
		} catch (Exception err) {
			System.out.println(err.getMessage());
		}
		
		
	}
	
	public static int indexOf(int[] arr, int num, int first, int last) {
		int index = -1;
		

		if(arr[first] == num) {
			index = first;
			return index;
		} else if(first<last) {
			return indexOf(arr, num, first+1, last);
		}
		
		return index;
	}
	
	public static int binarySearch(int[] arr, int num, int first, int last) {
		int index =-1;
		int mid = (first+last)/2;
		System.out.println("First: "+ first + " Last:" + last + " Mid:" + mid);
		//System.out.println("Arr First: "+ arr[first] + " Last:" + arr[last-1] + " Mid:" + arr[mid]);
		
		 if (first>last)  {
			return index;
		} else if(arr[mid] ==num) {
			return mid;
		}
		else  if(arr[mid]>num) {
			return binarySearch(arr, num, first, mid-1);
		} else if (arr[mid]<num){
			return binarySearch(arr, num, mid+1, last);
		}
		return index;
		
	}
	public static void SelectionSort(int[] arr,int first, int last) {
		int lowestIndex = findLowestArr(arr,first, last);
		swap(arr, first, lowestIndex);
		
		if(first<last) {
			SelectionSort(arr, first+1, last);	
		}
		
	}
	
	public static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	public static int findLowestArr(int[] arr, int first,int last) {
		
		if(last<first) {
			return first;
		} else {
		 int numIndex = findLowestArr(arr,first, last-1);
		 int num = arr[numIndex];
		 int curr =arr[last];
		 if(num<curr) {
			 return numIndex;
		 }else { 
			 return last;
		 }
		}
	}
	
	public static void displayArr(int[] arr, int first,int last) {
		System.out.println(arr[first]);
		if(first<last) {
			displayArr(arr, first+1, last);
		}
	}
}
