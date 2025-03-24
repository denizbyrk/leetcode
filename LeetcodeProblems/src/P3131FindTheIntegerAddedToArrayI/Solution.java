package P3131FindTheIntegerAddedToArrayI;

public class Solution {

    public static int addedInteger(int[] nums1, int[] nums2) {
        
        int minNums1 = Integer.MAX_VALUE;
        int minNums2 = Integer.MAX_VALUE;
    	
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] < minNums1) {
                minNums1 = nums1[i];
            }
        }
        
        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] < minNums2) {
                minNums2 = nums2[i];
            }
        }
        
        int result = minNums2 - minNums1;
        
        return result;
    }
    
    public static void main(String[] args) {
    	
    	int[] nums1 = {2,6,4};
    	int[] nums2 = {9,7,5};
    	
    	int output = Solution.addedInteger(nums1, nums2);
    	
    	System.out.println(output);
    }
}