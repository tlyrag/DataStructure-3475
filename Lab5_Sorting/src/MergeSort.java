
public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8,1,4,6,7,56,34,22,32,14,99};
		int[] arr2 = {3,8,9,10};
		
		//int[] mergeArr = mergeArray(arr, arr2);
		
		int[] sortedArr = mergeSort(arr,0,arr.length-1);
		displayArr(sortedArr);
			
	}
	public static int[] mergeSort(int[] arr,int first, int last) {
		int[] tempArr  = arr;
		int mid = (last+first)/2;
		
		
		if(first==last) {
			int[] tempArr2 = {arr[first]};
			return tempArr2;
		} else {
			int [] arr1 = mergeSort(tempArr, first, mid); 
			int [] arr2 = mergeSort(tempArr, mid+1, last);
			tempArr = mergeArray(arr1, arr2);
		}
		
		return tempArr;
		
	}
	
	public static int[] mergeArray(int[] arr1, int[]arr2) {
		
		int[] tempArr = new int[arr1.length+arr2.length];
		int j=0;
		int k=0;
		
		for(int i =0;i<tempArr.length;i++) {
			
			if(j>=arr1.length && k<arr2.length ) {
				tempArr[i] = arr2[k];
				k++;
			} else if(k>=arr2.length && j<arr1.length) {
				tempArr[i] = arr1[j];
				j++;
			}
			else if(arr1[j]<arr2[k]) {
				tempArr[i]=arr1[j];
				j++;
			} else if(arr1[j]>arr2[k]) {
				tempArr[i]=arr2[k];
				k++;
			}
			
	
		}
		
		return tempArr;
		
	}
	public static void displayArr(int[] arr) {
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}

