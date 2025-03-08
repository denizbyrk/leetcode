package P1688CountOfMatchesInTournament;

public class Solution {

    public static int numberOfMatches(int n) {
        
        int matchCount = 0;

        while (n > 1) {
        	
            if (n % 2 == 0) {
            	
            	matchCount += n / 2;
                n /= 2;
                
            } else {
            	
            	matchCount += (n - 1) / 2;
                n = (n - 1) / 2 + 1;
            }
        }

        return matchCount;
    }
    
    public static void main(String[] args) {
    	
    	int input = 15;
    	
    	int output = Solution.numberOfMatches(input);
    	
    	System.out.println(output);
    }
}