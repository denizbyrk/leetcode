package P0507PerfectNumber;

public class Solution {

    public static boolean checkPerfectNumber(int num) {
        
    	int sum = 0;
    	
    	for (int i = 1; i <= num / 2; i++) {
    		
    		if (num % i == 0) {
    			
    			sum += i;
    		}
    	}
    	
    	if (sum == num) return true;
    	
    	return false;
    }
    
    public static void main(String[] args) {
    	
    	int input = 8128;
    	
    	boolean output = Solution.checkPerfectNumber(input);
    	
    	System.out.println(output);
    }
}