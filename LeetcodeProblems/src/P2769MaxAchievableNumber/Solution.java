package P2769MaxAchievableNumber;

public class Solution {

    public static int theMaximumAchievableX(int num, int t) {
        
    	return num + (t * 2);
    }
    
    public static void main(String[] args) {
    	
    	int num = 3;
    	int t = 2;
    	
    	int output = Solution.theMaximumAchievableX(num, t);
    	
    	System.out.println(output);
    }
}