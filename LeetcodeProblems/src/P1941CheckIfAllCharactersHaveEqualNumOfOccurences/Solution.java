package P1941CheckIfAllCharactersHaveEqualNumOfOccurences;

import java.util.Arrays;

public class Solution {

    public static boolean areOccurrencesEqual(String s) {
        
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        
        int count = 1;
        int expectedCount = 0;

        for (int i = 1; i < chars.length; i++) {
        	
            if (chars[i] == chars[i - 1]) {
            	
                count++;
            } else {
            	
                if (expectedCount == 0) {
                	
                    expectedCount = count;
                } else if (count != expectedCount) {
                	
                    return false;
                }
                
                count = 1;
            }
        }
        
        if (expectedCount == 0 || count == expectedCount) return true;

        return false;
    }
    
    public static void main(String[] args) {
    	
    	String input = "abacbc";
    	
    	boolean output = Solution.areOccurrencesEqual(input);
    	
    	System.out.println(output);
    }
}