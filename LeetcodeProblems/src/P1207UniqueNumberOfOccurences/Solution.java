package P1207UniqueNumberOfOccurences;

import java.util.Arrays;

public class Solution {

    public static boolean uniqueOccurrences(int[] arr) {
        
        Arrays.sort(arr);
        boolean[] occured = new boolean[1001];
        int count = 1;

        for (int i = 1; i <= arr.length; i++) {
        	
            if (i < arr.length && arr[i] == arr[i - 1]) {
            	
                count++;
            } else {
            	
                if (occured[count]) {
                	
                    return false;
                }
                occured[count] = true;
                count = 1;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
    	
    	int[] input = {1,2,2,1,1,3};
    	
    	boolean output = Solution.uniqueOccurrences(input);
    	
    	System.out.println(output);
    }
}