package P0066PlusOne;

public class Solution {

    public static int[] plusOne(int[] digits) {
        
    	for (int i = digits.length - 1; i >= 0; i--) {
    		
    		if (digits[i] + 1 > 9 && i == 0) {

    			int[] newArr = new int[digits.length + 1];
    			newArr[0] = 1;
    			
    			for (int j = 1; j < digits.length; j++) {
    				
    				newArr[j] = digits[j];
    			}
    			
    			return newArr;
    			
    		} else if (digits[i] + 1 > 9 && i != 0) {
    			
    			digits[i] = 0;
    			
    		} else {
    			
    			digits[i] += 1;
    			
    			break;
    		}
    	}
    	
    	return digits;
    }
    
    public static void main(String[] args) {
    	
    	int[] digits = {9};
    	    	
    	int[] output = Solution.plusOne(digits);
    	
    	for(int i = 0; i < output.length; i++) {
    		
    		System.out.print(output[i] + "/");
    	}
    }
}