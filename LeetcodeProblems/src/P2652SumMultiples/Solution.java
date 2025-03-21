package P2652SumMultiples;

public class Solution {

    public static int sumOfMultiples(int n) {
        
    	int sum = 0;
    	
    	for (int i = 1; i <= n; i++) {
    		
    		if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
    			
    			sum += i;
    		}
    	}
    	
    	return sum;
    }
    
    public static void main(String[] args) {
    	
    	int num = 9;
    	
    	int output = Solution.sumOfMultiples(num);
    	
    	System.out.println(output);
    }
}