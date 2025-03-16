package P3285FindIndicesOfStableMountains;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static List<Integer> stableMountains(int[] height, int threshold) {
        
        List<Integer> result = new ArrayList<Integer>();
        
        for (int i = 1; i < height.length; i++) {
        	
            if (height[i - 1] > threshold) {
            	
                result.add(i);
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
    	
        int[] height = {1, 2, 3, 4, 5};
        int threshold = 2;
        
        List<Integer> output = Solution.stableMountains(height, threshold);
        
        System.out.println(output);
    }
}