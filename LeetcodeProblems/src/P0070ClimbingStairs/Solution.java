package P0070ClimbingStairs;

public class Solution {

	//after solving this i realized this is just fibonacci sequence, but i will just leave it like this for now
    public static int climbStairs(int n) {
        
        if (n == 0) return 0;

        int[] ways = new int[n + 1];

        ways[0] = 1;
        ways[1] = 1;

        for (int i = 2; i <= n; i++) {
        	
            for (int j = 1; j <= i; j++) {

                if (j == 1) {
                	
                    ways[i] += ways[i - 1];
                    
                } else if (j == 2) {
                	
                    ways[i] += ways[i - 2];
                }
            }
        }

        return ways[n];
    }
    
    public static void main(String[] args) {
    	
    	int input = 4;
    	
    	int output = Solution.climbStairs(input);
    	
    	System.out.println(output);
    }
}