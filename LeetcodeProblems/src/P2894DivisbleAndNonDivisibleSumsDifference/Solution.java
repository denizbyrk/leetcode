package P2894DivisbleAndNonDivisibleSumsDifference;

public class Solution {

    public static int differenceOfSums(int n, int m) {
        
    	int nonDivisible = 0;
    	int divisible = 0;
    	
    	for (int i = 1; i <= n; i++) {
    		
    		if (i % m == 0) {
    			
    			divisible += i;
    		} else {
    			
    			nonDivisible += i;
    		}
    	}
    	
    	return nonDivisible - divisible;
    }
    
    public static void main(String[] args) {
    	
    	int n = 10;
    	int m = 3;
    	
    	int output = Solution.differenceOfSums(n, m);
    	
    	System.out.println(output);
    }
}