package P0055JumpGame;

public class Solution {

    public static boolean canJump(int[] nums) {
        
    	int currentIndex = 0;
    	
    	if (nums.length == 1) return true;
    	if (nums[0] == 0) return false;
    	
    	for (int i = 0; i < nums.length; i++) {
    		
    		if (i > currentIndex) return false;
    		
    		int maxJump = nums[i];
    		
            for (int j = 1; j <= maxJump; j++) {
            	
                currentIndex = Math.max(currentIndex, i + j);

                if (currentIndex >= nums.length - 1) return true;
            }
    	}
    	
    	return false;
    }
    
    public static void main(String[] args) {
    	
    	int[] input = {5,9,3,2,1,0,2,3,3,1,0,0};
    	
    	boolean output = Solution.canJump(input);
    	
    	System.out.println(output);
    }
}