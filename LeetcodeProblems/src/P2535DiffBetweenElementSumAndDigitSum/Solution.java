package P2535DiffBetweenElementSumAndDigitSum;

public class Solution {

    public static int differenceOfSum(int[] nums) {
     
    	int elementSum = 0;
    	int digitSum = 0;
    	
    	for (int i = 0; i < nums.length; i++) {
    		    		
    		if (nums[i] > 9) {
    			
    			char[] digits = new String("" + nums[i]).toCharArray();
    			
    			for (char d : digits) {
    				
    				digitSum += Integer.parseInt(Character.toString(d));
    			}
    			
    		} else {
    			
    			digitSum += nums[i];
    		}
    		
    		elementSum += nums[i];
    	}
    	
    	int result = elementSum - digitSum;
    	
    	return result;
    }
    
    public static void main(String[] args) {
    	
    	int[] input = {1,15,6,3};
    	
    	int output = Solution.differenceOfSum(input);
    	
    	System.out.println(output);
    }
}