package P1662EquivalentStrings;

public class Solution {

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
    	String firstWord = "";
    	String secondWord = "";
    	
    	for (int i = 0; i < word1.length; i++) {
    		
    		firstWord += word1[i];
    	}
    	
    	for (int i = 0; i < word2.length; i++) {
    		
    		secondWord += word2[i];
    	}
    	
    	if (firstWord.equals(secondWord)) return true;
    	else return false;
    }
    
    public static void main(String[] args) {
    	
    	String[] word1 = {"abc", "d", "defg"};
    	String[] word2 = {"abcddefg"};
    	
    	boolean output = Solution.arrayStringsAreEqual(word1, word2);
    	
    	System.out.println(output);
    }
}