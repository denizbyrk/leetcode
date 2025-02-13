package P0009PalindromeNumber;

public class Solution {
	
    public static boolean isPalindrome(int x) {
        
    	String defaultNumber = "" + x;    	
    	String reverse = new StringBuffer(defaultNumber).reverse().toString();
    	
		if(defaultNumber.equals(reverse)) {
			
			return true;
		}
		
    	return false;
    }

	public static void main(String[] args) {
		
		int input = 123454321;
		
		boolean output = isPalindrome(input);
		
		System.out.println(output);
	}
}