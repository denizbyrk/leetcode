package P0027RemoveElement;

public class Solution {

    public static int removeElement(int[] nums, int val) {
        
        int index = 0;
        
        for (int i = 0; i < nums.length; i++) {
        	
            if (nums[i] != val) {
            	
                nums[index] = nums[i]; 
                index++;
            }
        }
    	
    	return index;
    }
	
	public static void main(String[] args) {
		
		int[] nums = {0, 1, 2, 2, 3, 0, 4, 2, 1, 6, 2, 6};
		int val = 2; 
		
		int k = Solution.removeElement(nums, val);
		
		System.out.println(k);
	}
}