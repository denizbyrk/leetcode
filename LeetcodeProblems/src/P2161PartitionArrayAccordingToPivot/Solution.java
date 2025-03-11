package P2161PartitionArrayAccordingToPivot;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static int[] pivotArray(int[] nums, int pivot) {
       
    	List<Integer> resultList = new ArrayList<Integer>();
    	int sameAsPivot = 0;
    	
    	for (int i = 0; i < nums.length; i++) {
    		
    		if (nums[i] < pivot) {
    			
    			resultList.add(nums[i]);
    		} else if (nums[i] == pivot) {
    			
    			sameAsPivot++;
    		}
    	}
    	
    	for (int i = 0; i < sameAsPivot; i++) {
    		
    		resultList.add(pivot);
    	}
    	
    	for (int i = 0; i < nums.length; i++) {
    		
    		if (nums[i] > pivot) {
    			
    			resultList.add(nums[i]);
    		}
    	}
    	
    	int[] output = resultList.stream().mapToInt(i -> i).toArray();
    	    	
    	return output;
    }
    
    public static void main(String[] args) {
    	
    	int[] input = {9,12,5,10,14,3,10};
    	int pivot = 10;
    	
    	int[] output = Solution.pivotArray(input, pivot);
    	
    	for (int i = 0; i < output.length; i++) {
    		
    		System.out.print(output[i] + "/");
    	}
    }
}