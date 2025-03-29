package P2460ApplyOperationsToAnArray;

public class Solution {

    public static int[] applyOperations(int[] nums) {
    	
        for (int i = 0; i < nums.length - 1; i++) {
        	
            if (nums[i] == nums[i + 1] && nums[i] != 0) {
            	
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
        	
            if (nums[i] != 0) {
            	
                nums[index++] = nums[i];
            }
        }

        while (index < nums.length) {
        	
            nums[index++] = 0;
        }

        return nums;
    }
	
	public static void main(String[] args) {
		
		int[] nums = {1,2,2,1,1,0};
		
		int[] output = Solution.applyOperations(nums);
		
		for (int i = 0; i < output.length; i++) {
			
			System.out.print(output[i] + " / ");
		}
	}
}