
public class PalindromeTesting {
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(-121)) ;
	}
    public static boolean isPalindrome(int x) {

        String stringNum = Integer.toString(x);
        String[] arr = stringNum.split("");
        String  tempString = "";
        int i=0;



        for( int j =arr.length-1; j>=0;j--) {           
                tempString +=arr[j];

        }

        
        if(tempString.equals(stringNum)) {
            return true;
        } else {
            return false;
        }
    }
}
