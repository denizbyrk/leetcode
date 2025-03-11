package P1920BuildArrayFromPermutation;

public class Solution {

    public static int[] buildArray(int[] nums) {
        
    	int[] result = new int[nums.length];
    	
    	for (int i = 0; i < result.length; i++) {
    		
    		result[i] = nums[nums[i]];
    	}
    	
    	return result;
    }
    
    public static void main(String[] args) {
    	
    	int[] nums = {0,2,1,5,3,4};
    	
    	int[] output = Solution.buildArray(nums);
    	
    	for (int i = 0; i < output.length; i++) {
    		
    		System.out.print(output[i] + " / ");
    	}
    }
}