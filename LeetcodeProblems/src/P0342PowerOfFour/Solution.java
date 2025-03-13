package P0342PowerOfFour;

public class Solution {

    public static boolean isPowerOfThree(double n) {
        
    	while (n >= 4) {
    		
    		n /= 4;
    	}
    	
    	if (n == 1) return true;
    	
    	return false;
    }
    
    public static void main(String[] args) {
    	
    	double n = 256 * 256 * 256;
    	
    	boolean output = Solution.isPowerOfThree(n);
    	
    	System.out.println(output);
    }
}