package P0034FirstAndLastPositionOfElement;

public class Solution {

    public static int[] searchRange(int[] nums, int target) {
        
    	int[] output = {-1, -1};
    	
    	boolean starting = false;
    	
    	for (int i = 0; i < nums.length; i++) {
    		
    		if (nums[i] == target && starting == true) {
    			
    			output[1] = i;
    		}
    		
    		else if (nums[i] == target && starting == false) {
    			
    			output[0] = i;
    			output[1] = i;
    			
    			starting = true;
    		}
    	}
    	
    	return output;
    }
    
    public static void main(String[] args) {
    	
    	int[] input = {5, 7, 7, 8, 8, 10};
    	
    	int[] output = Solution.searchRange(input, 6);
    	
    	for (int i = 0; i < output.length; i++) {
    		
    		System.out.print(output[i] + "/");
    	}
    }
}