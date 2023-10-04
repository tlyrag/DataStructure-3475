
public class ArrayWithoutRepeatString {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =lengthOfLongestSubstring("dvdf");
		
		System.out.println(a);
	}
	    public static int lengthOfLongestSubstring(String s) {
	        if(s.length()==0) {
	        	return 0;
	        }
	        
	    	
	    	String[] stringArr = s.split("");
	        System.out.println(stringArr[0]);
	        String[] biggerArr={stringArr[0]};
	        String[] compareArr = {stringArr[0]};
	        int j =1;
	        for(int i=1; i<stringArr.length;i++) {
	           
	           if(!checkIfContains(stringArr[i], compareArr)) {
	               compareArr=addElement(stringArr[i], compareArr);
	               if(compareArr.length>biggerArr.length) {
			        	biggerArr= compareArr.clone();
			        }
	           } else {
	        	   j++;
	        	   i=j-1;
	        	   String[] newArr = {stringArr[i]};
	        	   compareArr = newArr.clone();
	        	   
	        	   
	           }
	           
	           
	        }
	        
	        return biggerArr.length;
	    }

	    public  static boolean checkIfContains(String char1, String[] arr) {
	         for(int i=0;i<arr.length;i++) {
	             if(arr[i].equals(char1)) {
	                 return  true;
	             }
	            }
	        return false;
	    }

	    public  static String[] addElement(String char1, String[] arr) {
	        String[] tempArr = new String[arr.length +1];
	        for(int i =0;i<tempArr.length-1;i++) {
	            tempArr[i] = arr[i];
	        }
	        
	        tempArr[arr.length]= char1;
	        return tempArr;
	    }
	}

