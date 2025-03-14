package P2824CountPairsWhoseSumIsLessThanTarget;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static int countPairs(List<Integer> nums, int target) {
        
    	int pairs = 0;
    	
    	for (int i = 0; i < nums.size(); i++) {
    		
    		for (int j = 0; j < nums.size(); j++) {
    			
    			if (j == i) continue;
    			
    			if (j > i && nums.get(j) + nums.get(i) < target) {
    				
    				pairs++;
    			}
    		}
    	}
    	
    	return pairs;
    }
    
    public static void main(String[] args) {
    	
    	List<Integer> nums = new ArrayList<Integer>();
    	int[] input = {-6,2,5,-2,-7,-1,3};
    	
    	for (int i = 0; i < input.length; i++) {
    		
    		nums.add(input[i]);
    	}
    	
    	int target = -2;
    	
    	int output = Solution.countPairs(nums, target);
    	
    	System.out.println(output);
    }
}