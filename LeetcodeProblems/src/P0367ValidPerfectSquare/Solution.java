package P0367ValidPerfectSquare;

public class Solution {

    public static boolean isPerfectSquare(int num) {
        
    	double sqrt = Math.sqrt(num);
    	
    	if (sqrt % Math.floor(sqrt) == 0) {
    		
    		return true;
    	}
    	
    	return false;
    }
    
    public static void main(String[] args) {
    	
    	int num = 4096;
    	
    	boolean output = Solution.isPerfectSquare(num);
    	
    	System.out.println(output);
    }
}