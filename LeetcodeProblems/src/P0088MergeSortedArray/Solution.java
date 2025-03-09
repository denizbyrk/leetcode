package P0088MergeSortedArray;

import java.util.Arrays;

public class Solution {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        Arrays.sort(nums1);
    }
	
	public static void main(String[] args) {
		
		int[] nums1 = {1,2,3,0,0,0};
		int m = 3;
		
		int[] nums2 = {2,5,6};
		int n = 3;
		
		Solution.merge(nums1, m, nums2, n);
		
		for (int i = 0; i < nums1.length; i++) {
			
			System.out.print(nums1[i] + "/");
		}
	}
}