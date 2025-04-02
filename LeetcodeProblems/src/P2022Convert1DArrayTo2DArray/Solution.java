package P2022Convert1DArrayTo2DArray;

import java.util.Arrays;

public class Solution {

    public static int[][] construct2DArray(int[] original, int m, int n) {
        
    	int[][] result = new int[m][n];
    	
        if (original.length != m * n) {
        	
            return new int[0][0]; 
        }
        
        for (int i = 0; i < original.length; i++) {
        	
            result[i / n][i % n] = original[i];
        }
        
        return result;
    }
    
    public static void main(String[] args) {
    	
    	int[] original = {1,2,3,4};
    	int m = 2;
    	int n = 2;
    	
    	int[][] output = Solution.construct2DArray(original, m, n);
    	
    	System.out.println(Arrays.deepToString(output));
    }
}