package P0069SqrtX;

public class Solution {

    public static int mySqrt(int x) {
            	
    	return (int)Math.sqrt(x);
    }
    
    public static void main(String[] args) {
    	
    	int x = 8;
    	
    	int output = Solution.mySqrt(x);
    	
    	System.out.println(output);
    }
}