package P2114MaxNumOfWordsFoundInSentences;

public class Solution {

    public static int mostWordsFound(String[] sentences) {
        
        int max = 0;

        for (int i = 0; i < sentences.length; i++) {

            String[] words = sentences[i].split(" ");
            
            int count = words.length;

            if (count > max) {
            	max = count;
            }
        }

        return max;
    }
    
    public static void main(String[] args) {
    	
    	String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
    	
    	int output = Solution.mostWordsFound(sentences);
    	
    	System.out.println(output);
    }
}