package P0026RemoveDuplicatesFromSortedArray;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static int removeDuplicates(int[] nums) {
        
    	List<Integer> existingNumbers = new ArrayList<Integer>();
    	    	
    	for (int i = 0; i < nums.length; i++) {
    		
    		if (existingNumbers.contains(nums[i])) {
    			
    			continue;
    		} else {
    			
    			existingNumbers.add(nums[i]);
    		}
    	}
    	
    	for (int i = 0; i < existingNumbers.size(); i++) {
    		    		
    		nums[i] = existingNumbers.get(i);
    	}
    	    	
    	return existingNumbers.size();
    }
    
    public static void main(String[] args) {
    	
    	int[] nums = {1, 1, 2, 2, 2, 3, 4, 4, 5, 5, 5, 5};
    	
    	int k = Solution.removeDuplicates(nums);
    	
    	System.out.println("\nElement count: " + k);
    }
}