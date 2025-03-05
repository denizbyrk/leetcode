package P1512NumberOfGoodPairs;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static int numIdenticalPairs(int[] nums) {
        
    	List<List<Integer>> goodPair = new ArrayList<>();
    	
    	for (int i = 0; i < nums.length; i++) {
    		
    		for (int j = 0; j < nums.length; j++) {
    			
    			if (i == j) continue;
    			
    			if (nums[i] == nums[j]) {
    				
    				List<Integer> n = new ArrayList<>();
    				
    				n.add(i);
    				n.add(j);
    				
    				goodPair.add(n);
    			}
    		}
    	}
    	
    	return goodPair.size() / 2;
    }
    
    public static void main(String[] args) {
    	
    	int[] input = {1,1,1,1};
    	
    	int output = Solution.numIdenticalPairs(input);
    	
    	System.out.println(output);
    }
}