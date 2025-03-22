package P1464MaxProductOfTwoElementsInAnArray;

public class Solution {

    public static int maxProduct(int[] nums) {
        
    	int maxProduct = 0;
    	int index1 = 0;
    	int index2 = 0;
    	
    	for (int i = 0; i < nums.length; i++) {
    		
    		for (int j = 0; j < nums.length; j++) {
    			
    			if (i == j) continue;
    			
    			int product = nums[i] * nums[j];
    			
    			if (product > maxProduct) {
    				
    				maxProduct = product;
    				index1 = i;
    				index2 = j;
    			}
    		}
    	}
    	
    	int result = (nums[index1] - 1) * (nums[index2] - 1);
    	
    	return result;
    }
    
    public static void main(String[] args) {
    	
    	int[] nums = {3,4,5,2};
    	
    	int output = Solution.maxProduct(nums);
    	
    	System.out.println(output);
    }
}