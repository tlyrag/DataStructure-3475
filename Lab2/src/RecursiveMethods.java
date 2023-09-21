
public class RecursiveMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CountDown(5);
		//countDown(5);
		//countUp(0);
		//int sum = sumOf(10);
		//int mult = multiplication(20, 4);
		//System.out.println(mult);
		//displayRowOfCharacter('*', 5);
		int[] arr = {30,7,10,14,6,18};
//		int calc = arrayCalc(arr,0,arr.length-1);
//		System.out.println();
//		System.out.println(calc);
//		int calc2 = arrayCalcMid(arr,0,arr.length-1);
//		System.out.println();
//		System.out.println(calc2);
//		int bigNum = bigNumArray(arr,0,arr.length);
//		System.out.println(bigNum);
		
		//displayArrPortionBackwards(arr,2,4);
		System.out.println(fTest(16));
		int b =-2;
		String a = Integer.toString(b);
		System.out.println(a);
	}
	
	
	/// CLASS CODES
	public static void CountDown(int n) {
		
		System.out.println(n+"!");
		
		if(n>1) {
			CountDown(n-1);
		}
		
	}
	
	public static void countDown(int n) {
		
		if(n==1) { // BASE CASE
			System.out.println(n);
		} else { // RECURSION CASE
			
			
			System.out.println(n);
			countDown(n-1);
		}
		
	}
	
	public static void countUp(int n) {
		
		if(n==10) { // BASE CASE
			System.out.println(n);
		} else { // RECURSION CASE
			
			countUp(n-1);
			System.out.println(n);
		}
		
	}

	public static int sumOf(int n) {
		if(n==1) {
			return 1;
		} else {
			return n+ sumOf(n-1);
		}
	}
	/// Ex:1
	public static int multiplication(int x, int y ) {
	
		if(x==1) {
			return y;
		}
		else {
			return y+multiplication(x-1, y);
		}
	}
	/// Ex:2
	public static void displayRowOfCharacter(char a, int i) {
		if(i==1) {
			System.out.print(a);
		} else {
			System.out.print(a);
			displayRowOfCharacter(a, i-1);
		}
	}
	//Ex:3
	public static int arrayCalc (int[] arr, int first, int last) {
		if(first==last) {
			return arr[last];
		} else {
			System.out.print(arr[first]);
			return arr[first] +arrayCalc(arr, first+1, last);
		}
		
	}
	public static int arrayCalcMid(int[] arr, int first, int last) {
		if(first==last) {
			return arr[last];
		} else {
			int mid = (first+last)/2;
			return arrayCalc(arr, first, mid) + arrayCalc(arr, mid+1, last);
		} 
	}
	// Ex:4
	public static int bigNumArray(int[] arr,int first,int last) {
		//Base case
		if(first==last-1) {
			if(arr[first]>arr[last-1]) {
				return arr[first];
			} else {
				return arr[last-1];
			}
			//recursive Case
		} else {
			if(arr[first]> bigNumArray(arr,first+1,last)) {
				return arr[first];
			} else {
				return  bigNumArray(arr,first+1,last);
			}
		}
	}
	/// EX 6:
	public static void displayArrPortionBackwards(int[] arr, int first, int last) {
		
		if(first == last) {
			System.out.println(arr[last]);
		} else {
			displayArrPortionBackwards(arr, first+1, last);
			System.out.println(arr[first]);
		}
	}
	public static int fTest(int n) {
		 
		 {
		   	 int result = 0;
		   	 if (n < 4)
		        result = 1;
		    	 else
		        	result = fTest(n / 2) + fTest(n / 4);
		     	return result;
		 }

	}
}


