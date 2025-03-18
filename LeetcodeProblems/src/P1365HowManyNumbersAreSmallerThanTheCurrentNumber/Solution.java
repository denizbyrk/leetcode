package P1365HowManyNumbersAreSmallerThanTheCurrentNumber;

public class Solution {

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        
    	int[] result = new int[nums.length];
    	
    	for (int i = 0; i < nums.length; i++) {
    		
    		for (int j = 0; j < nums.length; j++) {
    			
    			if (i == j) continue;
    			
    			if (nums[j] < nums[i]) {
    				
    				result[i]++;
    			}
    		}
    	}
    	
    	return result;
    }
    
    public static void main(String[] args) {
    	
    	int[] nums = {8,1,2,2,3};
    	
    	int[] output = Solution.smallerNumbersThanCurrent(nums);
    	
    	for (int i = 0; i < output.length; i++) {
    		
    		System.out.print(output[i] + " / ");
    	}
    }
}