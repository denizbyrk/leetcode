package P2418SortThePeople;

import java.util.Arrays;

public class Solution {

    public static String[] sortPeople(String[] names, int[] heights) {
    
    	String[] result = names;
    	
        for (int i = 0; i < result.length - 1; i++) {
        	
            for (int j = 0; j < result.length - i - 1; j++) {
            	
                if (heights[j] < heights[j + 1]) {

                    int tempHeight = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = tempHeight;

                    String tempName = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = tempName;
                }
            }
        }
    	
    	return result;
    }
    
    public static void main(String[] args) {
    	
    	String[] names = {"Mary","John","Emma"};
    	int[] heights = {180, 165, 170};
    	
    	String[] output = Solution.sortPeople(names, heights);
    	
    	System.out.println(Arrays.toString(output));
    }
}