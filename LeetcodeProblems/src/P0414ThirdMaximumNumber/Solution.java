package P0414ThirdMaximumNumber;

public class Solution {

	public static int thirdMax(int[] nums) {
		
        int[] maxs = new int[3];
        boolean[] found = new boolean[3];

        for (int i = 0; i < 3; i++) {
        	
            Integer max = null;

            for (int j = 0; j < nums.length; j++) {

                boolean isDuplicate = false;
                for (int k = 0; k < i; k++) {
                	
                    if (nums[j] == maxs[k]) {
                    	
                        isDuplicate = true;
                        break;
                    }
                }
                
                if (!isDuplicate && (max == null || nums[j] > max)) {
                	
                    max = nums[j];
                }
            }

            if (max == null) {
            	
                break;
            }

            maxs[i] = max;
            found[i] = true;
        }

        if (found[2]) {
        	
            return maxs[2];
            
        } else {
        	
            return maxs[0];
        }
	}

	public static void main(String[] args) {
		
		int[] input = {3, 3, 4, 3, 4, 3, 0, 3, 3};
		
		int output = thirdMax(input);
		
		System.out.println(output); 
	}
}