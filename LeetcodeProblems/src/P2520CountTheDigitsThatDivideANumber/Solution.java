package P2520CountTheDigitsThatDivideANumber;

public class Solution {

    public static int countDigits(int num) {
        
    	String number = "" + num;
    	char[] digits = number.toCharArray();
    	int total = 0;
    	
    	for (int i = 0; i < digits.length; i++) {
    		
    		int divisor = Integer.parseInt(Character.toString(digits[i]));
    		
    		if (num % divisor == 0) {
    			
    			total++;
    		}
    	}
    	
    	return total;
    }
    
    public static void main(String[] args) {
    	
    	int num = 1248;
    	
    	int output = Solution.countDigits(num);
    	
    	System.out.println(output);
    }
}