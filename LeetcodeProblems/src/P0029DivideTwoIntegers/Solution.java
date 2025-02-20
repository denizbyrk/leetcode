package P0029DivideTwoIntegers;

public class Solution {

    public static int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
        	
            return Integer.MAX_VALUE;
        }
        
        return dividend / divisor;
    }

    public static void main(String[] args) {
    	
        long dividend = -2147483648;
        long divisor = -1;

        int output = Solution.divide((int)dividend, (int)divisor);

        System.out.println(output);
    }
}