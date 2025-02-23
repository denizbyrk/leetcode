package P0231PowerOfTwo;

public class Solution {

    public static boolean isPowerOfTwo(int n) {
        
    	if (n == 0) return false;
    	
    	while (n % 2 == 0 && n != 1) {
    		
    		n /= 2;
    		
    		System.out.println(n);
    	}
    	
    	if (n == 1) return true;
    	else return false;
    }
    
    public static void main(String[] args) {
    	
    	int input = 1;
    	
    	boolean output = Solution.isPowerOfTwo(input);
    	
    	System.out.println(output);
    }
}