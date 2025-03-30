package P2341MaxNumberOfPairsInArray;

import java.util.Arrays;

public class Solution {

    public static int[] numberOfPairs(int[] nums) {
        
        Arrays.sort(nums);
        
        int pairs = 0, leftovers = 0;
        int i = 0;

        while (i < nums.length) {

            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
            	
                pairs++;
                i += 2;
            } else {
            	
                leftovers++;
                i++;
            }
        }
    	
        int[] result = new int[2];
        result[0] = pairs;
        result[1] = leftovers;
        
        return result;
    }
    
    public static void main(String[] args) {
    	
    	int[] input = {1,3,2,1,3,2,2};
    	
    	int[] output = Solution.numberOfPairs(input);
    	
    	for (int i = 0; i < output.length; i++) {
    		
    		System.out.print(output[i] + " / ");
    	}
    }
}