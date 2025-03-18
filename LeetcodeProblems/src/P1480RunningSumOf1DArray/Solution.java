package P1480RunningSumOf1DArray;

public class Solution {

    public static int[] runningSum(int[] nums) {
        
    	int[] result = new int[nums.length];
    	
    	for (int i = 0; i < nums.length; i++) {
    		
    		for (int j = i; j >= 0; j--) {
    			
    			result[i] += nums[j];
    		}
    	}
    	
    	return result;
    }
    
    public static void main(String[] args) {
    	
    	int[] nums = {3,1,2,10,1};
    	
    	int[] output = Solution.runningSum(nums);
    	
    	for (int i = 0; i < output.length; i++) {
    		
    		System.out.print(output[i] + " / ");
    	}
    }
}