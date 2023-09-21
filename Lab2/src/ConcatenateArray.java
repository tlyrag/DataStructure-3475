
public class ConcatenateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {0}; 
		int m = 0; 
		int[] nums2 = {1}; 
		int n = 1;
		merge(nums1,m,nums2,n);
	}

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0) {
            for(int i=m;i<nums2.length;i++) {
            	nums1[i]= nums2[i];
            }
        } else {
            nums1 = concatenateArr(nums1,nums2,m);
            nums1 = bubbleSort(nums1);

        }
    }

    public static int[] concatenateArr(int[] arr1, int[] arr2, int firstIndex) {
        int count =0;

        for(int i =firstIndex; i<arr1.length; i++) {
            arr1[i] = arr2[count];
            count++;
        }
        return arr1;
    }
    public static int[] bubbleSort(int array[]) {
        int size = array.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                }
            }
        }
        return array;
    }       

}




    

