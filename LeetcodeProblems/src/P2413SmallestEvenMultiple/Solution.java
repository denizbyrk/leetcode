package P2413SmallestEvenMultiple;

public class Solution {

    public static int smallestEvenMultiple(int n) {
        
    	if (n % 2 == 0) return n;
    	
    	return n * 2;
    }
    
    public static void main(String[] args) {
    	
    	int n = 5;
    	
    	int output = Solution.smallestEvenMultiple(n);
    	
    	System.out.println(output);
    }
}