package P3232FindIfDigitGameCanBeWon;

public class Solution {

	public static boolean canAliceWin(int[] nums) {
        
    	int singleDigitSum = 0;
    	int doubleDigitSum = 0;
    	
    	for (int i = 0; i < nums.length; i++) {
    		
    		if (nums[i] < 10) {
    			
    			singleDigitSum += nums[i];
    		} else {
    			
    			doubleDigitSum += nums[i];
    		}
    	}

    	if (singleDigitSum != doubleDigitSum) return true;
    	
    	return false;
    }
	
	public static void main(String[] args) {
		
		int[] input = {1,2,3,4,10};
		
		boolean output = Solution.canAliceWin(input);
		
		System.out.println(output);
	}
}