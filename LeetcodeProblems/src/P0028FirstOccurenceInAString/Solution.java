package P0028FirstOccurenceInAString;

public class Solution {

    public static int strStr(String haystack, String needle) {
        
    	for (int i = 0; i <= haystack.length() - needle.length(); i++) {
    	
    		if (haystack.substring(i, i + needle.length()).equals(needle)) {
        	
        		return i;
        	}
    	}
    	
    	return -1;
    }
    
    public static void main(String[] args) {
    	
    	String haystack = "sadbutsad";
    	String needle = "sad";
    	
    	int output = Solution.strStr(haystack, needle);
    	
    	System.out.println(output);
    }
}