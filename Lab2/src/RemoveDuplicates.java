
public class RemoveDuplicates {
	public static int[]  a = {0,0,1,1,1,2,2,3,3,4};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		removeDuplicates(a);
		displayArr(a);
	}

    public static int removeDuplicates(int[] nums) {
        
        int[] finalNums = {nums[0]};
        
        if(nums.length ==1) {
            return 1;
        }

        int count =0;
        int curr = 0;
        int next = 1;
      
        while(next< nums.length) {
            
            if(nums[curr] != nums[next]) {
                int[] tempNums = new int[finalNums.length+1];
                
                for(int i =0 ; i<finalNums.length;i++) {
                    tempNums[i] = finalNums[i];
                }
                
                count++;
                tempNums[count]= nums[next];
                finalNums = tempNums.clone();
                curr = next;
                next = next++;
            }
            else {
                next++;
            }
        }
        a = finalNums;
        
        return count;
    }
	    public static void displayArr(int[] nums) {
	    	for(int i=0;i<nums.length;i++) {
	    		System.out.println(nums[i]);
	    	}
	    }
	
}
