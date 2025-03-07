package P3289TheTwoSneakyNumbersOfDigitville;

public class Solution {

    public static int[] getSneakyNumbers(int[] nums) {
        
    	int[] sneakyNums = new int[2];
    	int index = 0;
    	
    	if (index < 1) {
    		
        	for (int i = 0; i < nums.length; i++) {
        		
        		if (sneakyNums[0] == nums[i]) continue;
        		
        		for (int j = 0; j < nums.length; j++) {
        			
        			if (index > 1) break;
        			if (j == i) continue;
        			
        			if (nums[i] == nums[j]) {
        				
        				sneakyNums[index] = nums[i];
        				index++;
        			}
        		}
        	}
    	}

    	return sneakyNums;
    }
    
    public static void main(String[] args) {
 
    	int[] nums = {7, 1, 5, 4, 3, 4, 6, 0, 9, 5, 8, 20};
    	
    	int[] output = Solution.getSneakyNumbers(nums);
    	
    	for (int i = 0; i < output.length; i++) {
    		
    		System.out.print(output[i] + " / ");
    	}
    }
}