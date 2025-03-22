package P3099HarshadNumber;

public class Solution {

    public static int sumOfTheDigitsOfHarshadNumber(int x) {
        
    	char[] digits = new String("" + x).toCharArray();
    	int digitSum = 0;
    	
    	for (int i = 0; i < digits.length; i++) {
    		
    		digitSum += Integer.parseInt(Character.toString(digits[i]));
    	}
    	
    	if (x % digitSum == 0) return digitSum;
    	
    	return -1;
    }
    
    public static void main(String[] args) {
    	
    	int x = 18;
    	
    	int output = Solution.sumOfTheDigitsOfHarshadNumber(x);
    	
    	System.out.println(output);
    }
}