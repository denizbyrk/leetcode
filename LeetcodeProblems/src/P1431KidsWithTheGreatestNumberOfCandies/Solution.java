package P1431KidsWithTheGreatestNumberOfCandies;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
    	List<Boolean> results = new ArrayList<Boolean>();
    	int maxNum = 0;
    	
    	for (int i = 0; i < candies.length; i++) {
    		
    		if (candies[i] > maxNum) {
    			
    			maxNum = candies[i];
    		}
    	}
    	
    	for (int i = 0; i < candies.length; i++) {
    	
    		if (candies[i] + extraCandies >= maxNum) {
    			
    			results.add(i, true);
    		} else {
    			
    			results.add(i, false);
    		}
    	}
    	
    	return results;
    }
	
	public static void main(String[] args) {
		
		int[] candies = {4,2,1,1,2};
		int extraCandies = 1;
		
		List<Boolean> output = Solution.kidsWithCandies(candies, extraCandies);
		
		System.out.println(output);
	}
}