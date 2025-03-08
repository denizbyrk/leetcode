package P0050PowXN;

public class Solution {

    public static double myPow(double x, int n) {
        
    	double pow = x;
    	
    	if (x == 1) return 1;
    	else if (n == 0) return 1;
    	
    	else if (n > 0) {
    		
        	for (int i = 1; i < n; i++) {
        		
        		x *= pow;
        		
        		if (Double.isInfinite(x)) {
        			
        			break;
        		}
        	}
        	
        	return x;
        	
    	} else if (n < 0) {
    		
        	for (int i = -1; i > n; i--) {
        		
        		x *= pow;
        		
        		if (Double.isInfinite(x)) {
        			
        			break;
        		}
        	}
        	
        	return 1/x;
    	}
    	
    	return 0;
    }
    
    public static void main(String[] args) {
    	
    	double x = -2;
    	int n = 2147483647;
    	
    	double output = Solution.myPow(x, n);
    	
    	System.out.println(output);
    }
}