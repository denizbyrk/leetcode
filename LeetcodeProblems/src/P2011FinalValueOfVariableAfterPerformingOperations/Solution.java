package P2011FinalValueOfVariableAfterPerformingOperations;

public class Solution {

    public static int finalValueAfterOperations(String[] operations) {
        
    	int x = 0;
    	
    	for (int i = 0; i < operations.length; i++) {
    		
    		switch(operations[i]) {
    		
    			case "X++":
    				x++;
    				break;
    			case "++X":
    				x++;
    				break;
    			case "X--":
    				x--;
    				break;
    			case "--X":
    				x--;
    				break;
    		}
    	}
    	
    	return x;
    }
    
    public static void main(String[] args) {
    	
    	String[] input = {"X++","++X","--X","X--"};
    	
    	int output = Solution.finalValueAfterOperations(input);
    	
    	System.out.println(output);
    }
}