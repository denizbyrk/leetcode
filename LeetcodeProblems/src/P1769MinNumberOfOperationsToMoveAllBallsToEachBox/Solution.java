package P1769MinNumberOfOperationsToMoveAllBallsToEachBox;

public class Solution {

    public static int[] minOperations(String boxes) {
        
    	int[] result = new int[boxes.length()];
    	    	
    	for (int i = 0; i < boxes.length(); i++) {
    	
    		int numOfOperations = 0;
    		
    		for (int j = 0; j < boxes.length(); j++) {
    			
    			if (i == j) continue;
    			
    			if (boxes.charAt(j) == '1') {
    				
    				if (j > i) {
    					
    					numOfOperations += j - i;
    				} else {
    					
    					numOfOperations += i - j;
    				}
    			}
    		}
    		
    		result[i] = numOfOperations;
    	}
    	
    	return result;
    }
    
    public static void main(String[] args) {
    	
    	String boxes = "110";
    	
    	int[] output = Solution.minOperations(boxes);
    	
    	for (int i = 0; i < output.length; i++) {
    		
    		System.out.print(output[i] + " / ");
    	}
    }
}