package P0258AddDigits;

public class Solution {

    public static int addDigits(int num) {
        
    	char[] digits = new String("" + num).toCharArray();
    	int digitSum = 0;
    	
    	do {
    		digitSum = 0;
    		
        	for (char digit : digits) {
        		
        		int d = Integer.parseInt(Character.toString(digit));
        		digitSum += d;
        	}
        	
        	digits = new String("" + digitSum).toCharArray();
        
    	} while (digits.length > 1);
    	
    	return digitSum;
    }
    
    public static void main(String[] args) {
    	
    	int num = 38;
    	
    	int output = Solution.addDigits(num);
    	
    	System.out.println(output);
    }
}