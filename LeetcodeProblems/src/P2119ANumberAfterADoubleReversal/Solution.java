package P2119ANumberAfterADoubleReversal;

public class Solution {

    public static boolean isSameAfterReversals(int num) {
        
        String revNum = new StringBuilder(String.valueOf(num)).reverse().toString();

        String result = new StringBuilder(revNum).reverse().toString();

        if (num == Integer.parseInt(result)) {
        	
        	return true;
        }
        
        return false;
    }
    
    public static void main(String[] args) {
    	
    	int num = 526;
    	
    	boolean output = Solution.isSameAfterReversals(num);
    	
    	System.out.println(output);
    }
}