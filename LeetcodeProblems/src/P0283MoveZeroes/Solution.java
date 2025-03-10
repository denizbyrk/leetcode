package P0283MoveZeroes;

public class Solution {

    public static void moveZeroes(int[] nums) {

        int index = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
            	
                nums[index] = nums[i];
                index++;
            }
        }

        while (index < nums.length) {
        	
            nums[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {
    	
        int[] nums1 = {0, 1, 0, 3, 12};
        
        Solution.moveZeroes(nums1);
                
        for (int i = 0; i < nums1.length; i++) {
        
        	System.out.print(nums1[i] + " / ");
        }
    }
}