package P0771JewelsAndStones;

public class Solution {

    public static int numJewelsInStones(String jewels, String stones) {
        
    	int numJewels = 0;
    	
    	for (char c : jewels.toCharArray()) {
    		
    		for (char ch : stones.toCharArray()) {
    			
    			if (c == ch) {
    				
    				numJewels++;
    			}
    		}
    	}
    	
    	return numJewels;
    }
    
    public static void main(String[] args) {
    	
    	String jewels = "aA";
    	String stones = "aAAbbbb";
    	
    	int output = Solution.numJewelsInStones(jewels, stones);
    	
    	System.out.println(output);
    }
}