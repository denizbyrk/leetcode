package P0557ReverseWordsInAStringIII;

public class Solution {

    public static String reverseWords(String s) {
        
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
        	
            result.append(new StringBuilder(word).reverse().toString()).append(" ");
        }
        
        return result.toString().trim();
    }
    
    public static void main(String[] args) {
    	
    	String input = "Let's take LeetCode contest";
    	
    	String output = Solution.reverseWords(input);
    	
    	System.out.println(output);
    }
}