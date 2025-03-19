package P2574LeftAndRightSumDifferences;

public class Solution {

    public static int[] leftRightDifference(int[] nums) {
        
    	int[] leftSum = new int[nums.length];
    	int[] rightSum = new int[nums.length];
    	int[] result = new int[nums.length];
    	
    	for (int i = 0; i < nums.length; i++) {
    		
    		for (int j = i; j >= 0; j--) {
    			
    			if (i == j) continue;
    			
    			leftSum[i] += nums[j];
    		}
    		
    		for (int j = i; j < nums.length; j++) {
    			
    			if (i == j) continue;
    			
    			rightSum[i] += nums[j];
    		}
    	}
    	
    	for (int i = 0; i < result.length; i++) {
    		
    		result[i] = Math.abs(leftSum[i] - rightSum[i]);
    	}
    	
    	return result;
    }
    
    public static void main(String[] args) {
    	
    	int[] input = {10,4,8,3};
    	
    	int[] output = Solution.leftRightDifference(input);
    	
    	for (int i = 0; i < output.length; i++) {
    		
    		System.out.print(output[i] + " / ");
    	}
    }
}