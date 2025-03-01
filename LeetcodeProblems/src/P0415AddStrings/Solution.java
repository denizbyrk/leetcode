package P0415AddStrings;

public class Solution {

    public static String addStrings(String num1, String num2) {
     
        java.math.BigInteger a = new java.math.BigInteger(num1);
        java.math.BigInteger b = new java.math.BigInteger(num2);
        
        java.math.BigInteger sum = a.add(b);
    	
    	return "" + sum;
    }
    
    public static void main(String[] args) {
    	
    	String num1 = "3876620623801494171";
    	String num2 = "6529364523802684779";
    	
    	String sum = Solution.addStrings(num1, num2);
    	
    	System.out.println(sum);
    }
}