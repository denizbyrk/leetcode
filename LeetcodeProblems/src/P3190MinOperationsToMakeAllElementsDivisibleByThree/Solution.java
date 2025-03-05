package P3190MinOperationsToMakeAllElementsDivisibleByThree;

public class Solution {

    public static int minimumOperations(int[] nums) {
        
    	int operations = 0;
    	
    	for (int i = 0; i < nums.length; i++) {
    		
    		if (nums[i] % 3 != 0) {
    			
    			operations += 1;
    		}
    	}
    	
    	return operations;
    }
    
    public static void main(String[] args) {
    	
    	int[] input = {1,2,3,4};
    	
    	int output = Solution.minimumOperations(input);
    	
    	System.out.println(output);
    }
}