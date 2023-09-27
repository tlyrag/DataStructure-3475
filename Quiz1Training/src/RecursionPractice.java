
public class RecursionPractice {
	
	public static void main(String[] args) {
	//int c = multInts(12, 5);
	//System.out.println(c);
		
	//displayRowOfCharacters(5);
	int[] a= {1,14,23,34,5,6};
	int b = findLargestValue(a,0,5);
	System.out.println(b);
	}

	
	public static int multInts(int a, int b) {
		
		if(a!=1) {
			return b + multInts(a-1, b);
		}
		return b;
	}
	
	public static void displayRowOfCharacters( int b) {
		if(b!= 1) {
			displayRowOfCharacters( b-1);
		}
		System.out.print(b);
	}
	
	public static int findLargestValue(int[] arr, int first, int last) {
		
		if(first>=last) {
			return arr[first];
		} else {
			int num = findLargestValue(arr, first+1, last);
			if(arr[first]>num) {
				return arr[first];
			} else {
				return num;
			}
			
		}
		
	}
	
}
