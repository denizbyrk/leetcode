package P0053MaxSubarray;

public class Solution {

    public static int maxSubArray(int[] nums) {
        
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
        	
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
    	
    	return maxSum;
    }
    
    public static void main(String[] args) {
    	
    	int[] input = {-2,1,-3,4,-1,2,1,-5,4};
    	
    	int output = Solution.maxSubArray(input);
    	
    	System.out.println(output);
    }
}