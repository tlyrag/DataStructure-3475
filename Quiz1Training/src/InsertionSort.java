
public class InsertionSort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,7,1,5,7,0};
		InsertSort(arr,0,arr.length-1);
		displayArr(arr);
	}
	
	public static void InsertSort(int[] arr, int first, int last ) {
		
		for(int i =first;i <last;i++) {
			int next =arr[first+1];
			int curr =arr[first]; 
			if(next<curr) {
				int temp =arr[first];
				arr[first]=next;
				arr[first+1] = temp;
			} 
			else if(first<last){
				
				InsertSort(arr,first+1,last);
				
			}
		}
	}
	public static void ShellSort (int[] arr, int first, int last) {
		int gap = (first+last)/2;
		
		
	}
	
	public static void displayArr(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
}
