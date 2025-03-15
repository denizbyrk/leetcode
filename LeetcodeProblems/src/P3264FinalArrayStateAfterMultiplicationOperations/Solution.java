package P3264FinalArrayStateAfterMultiplicationOperations;

public class Solution {

    public static int[] getFinalState(int[] nums, int k, int multiplier) {
        
    	int iteration = 0;
    	
    	while (iteration < k) {
    		
        	int min = nums[0];
        	int minIndex = 0;
        	
        	for (int i = 0; i < nums.length; i++) {
        		
        		if (nums[i] == min) continue;
        		
        		if (nums[i] < min) {
        			
        			min = nums[i];
        			minIndex = i;
        		} 
        	}
        	
        	nums[minIndex] *= multiplier;
        	iteration++;
    	}
    	
    	return nums;
    }
    
    public static void main(String[] args) {
    	
    	int[] nums = {2,1,3,5,6};
    	int k = 5;
    	int multiplier = 2;
    	
    	int[] output = Solution.getFinalState(nums, k, multiplier);
    	
    	for (int i = 0; i < output.length; i++) {
    		
    		System.out.print(output[i] + "/");
    	}
    }
}