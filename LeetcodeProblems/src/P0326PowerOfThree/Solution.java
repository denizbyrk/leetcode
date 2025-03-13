package P0326PowerOfThree;

public class Solution {

    public static boolean isPowerOfThree(double n) {
        
    	while (n >= 3) {
    		
    		n /= 3;
    	}
    	
    	if (n == 1) return true;
    	
    	return false;
    }
    
    public static void main(String[] args) {
    	
    	double n = 81 * 81 * 81;
    	
    	boolean output = Solution.isPowerOfThree(n);
    	
    	System.out.println(output);
    }
}