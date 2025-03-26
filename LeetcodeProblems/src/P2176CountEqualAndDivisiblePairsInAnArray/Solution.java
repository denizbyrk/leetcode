package P2176CountEqualAndDivisiblePairsInAnArray;

public class Solution {

    public static int countPairs(int[] nums, int k) {
     
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
        	
            for (int j = i + 1; j < nums.length; j++) {
            	
                if (nums[i] == nums[j] && (i * j) % k == 0) {
                	
                    count++;
                }
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
    	
    	int[] nums = {3,1,2,2,2,1,3};
    	int k = 2;
    	
    	int output = Solution.countPairs(nums, k);
    	
    	System.out.println(output);
    }
}