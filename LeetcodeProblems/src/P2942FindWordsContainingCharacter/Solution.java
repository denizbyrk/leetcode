package P2942FindWordsContainingCharacter;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static List<Integer> findWordsContaining(String[] words, char x) {
        
    	List<Integer> result = new ArrayList<Integer>();
    	
    	for (int i = 0; i < words.length; i++) {
    		
    		for (char c : words[i].toCharArray()) {
    			
    			if (x == c) {
    				
    				result.add(i);

    				break;
    			}
    		}
    	}
    	
    	return result;
    }
    
    public static void main(String[] args) {
    	
    	String[] words = {"abc","bcd","aaaa","cbc"};
    	char x = 'a';
    	
    	List<Integer> output = Solution.findWordsContaining(words, x);
    	
    	System.out.println(output);
    }
}