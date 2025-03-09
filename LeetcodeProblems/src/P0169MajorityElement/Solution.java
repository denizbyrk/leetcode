package P0169MajorityElement;

public class Solution {

    public static int majorityElement(int[] nums) {
        
    	int currentAppearance = 0;
    	int maxAppearance = 0;
    	int maxNum = 0;
    	
    	for (int i = 0; i < nums.length; i++) {
    		
    		if (maxAppearance > nums.length / 2) break;
    		
    		int currentNum = nums[i];
    		currentAppearance = 0;
    		
    		for (int j = 0; j < nums.length; j++) {
    			
    			if (currentAppearance > nums.length / 2) break;
    			
    			if (currentNum == nums[j]) {
    				
    				currentAppearance++;
    			}
    		}
    		
    		if (currentAppearance > maxAppearance) {
    			
    			maxAppearance = currentAppearance;
    			maxNum = currentNum;
    		}
    	}
    	
    	if (maxAppearance > nums.length / 2) return maxNum;
    	
    	return 0;
    }
    
    public static void main(String[] args) {
    	
    	int[] input = {2,2,1,1,1,2,2};
    	
    	int output = Solution.majorityElement(input);
    	
    	System.out.println(output);
    }
}