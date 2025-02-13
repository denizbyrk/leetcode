package P0014LongestCommonPrefix;

public class Solution {

    public static String longestCommonPrefix(String[] strs) {
    	
        String currentStr = strs[0];
        String nextStr = strs[strs.length - 1];
        String prefix = "";
        int shortest = 0;
        
        for(int i = 0; i < strs.length; i++) {
        	
        	if(i < strs.length - 1 && strs[i].length() < strs[i + 1].length()) {
        		
        		shortest = strs[i].length();
        	}
        }
        
        System.out.println(shortest);
        
        for(int i = 0; i < currentStr.length() && i < nextStr.length(); i++) {
        	if(currentStr.charAt(i) == nextStr.charAt(i)){
                prefix += currentStr.charAt(i);
            } else {
            	break;
            }
        }
        
        return prefix;
    }
    
    public static void main(String[] args) {
    	
    	String[] input = {"afox", "bfork", "foot"};
    	
    	String output = longestCommonPrefix(input);
    	
    	System.out.println(output);
    }
}