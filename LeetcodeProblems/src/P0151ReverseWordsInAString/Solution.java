package P0151ReverseWordsInAString;

public class Solution {

    public static String reverseWords(String s) {
        
    	String[] strings = s.split(" ");
    	StringBuilder reversedString = new StringBuilder();
    	
    	for (int i = strings.length - 1; i >= 0; i--) {
    		
    		if (strings[i].equals("") == false) {
    			
    			reversedString.append(strings[i] + " ");
    		}
    	}
    	
    	return reversedString.toString().trim();
    }
    
    public static void main(String[] args) {
    	
    	String input = "a good   example";
    	
    	String output = Solution.reverseWords(input);
    	
    	System.out.println(output);
    }
}