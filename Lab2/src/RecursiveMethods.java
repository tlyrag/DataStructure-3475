
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
		int[] arr = {1,2,3};
		int calc = arrayCalc(arr,arr.length);
		System.out.println(calc);
	}
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

	public static int multiplication(int x, int y ) {
	
		if(x==1) {
			return y;
		}
		else {
			return y+multiplication(x-1, y);
		}
	}
	public static void displayRowOfCharacter(char a, int i) {
		if(i==1) {
			System.out.print(a);
		} else {
			System.out.print(a);
			displayRowOfCharacter(a, i-1);
		}
	}
	
	public static int arrayCalc (int[] arr, int first, int last) {
		if(first<=last) {
			return arrayCalc(arr,first,last-1);
		}
		
	}

}


