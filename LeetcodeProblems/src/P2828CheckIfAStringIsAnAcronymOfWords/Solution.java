package P2828CheckIfAStringIsAnAcronymOfWords;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static boolean isAcronym(List<String> words, String s) {
        
        if (words.size() != s.length()) return false;

        StringBuilder acronym = new StringBuilder();
        
        for (String word : words) {
        	
            if (word.length() > 0) {
            	
                acronym.append(word.charAt(0));
            } else {
            	
                return false;
            }
        }

        if (acronym.toString().equals(s)) {
        	
        	return true;
        }
        
        return false;
    }
	
	public static void main(String[] args) {
		
		List<String> words = new ArrayList<String>();
		words.add("alice");
		words.add("bob");
		words.add("charlie");
		
		String s = "abc";
		
		boolean output = Solution.isAcronym(words, s);
		
		System.out.println(output);
	}
}