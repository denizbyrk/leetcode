package P1929ConcatenationOfArray;

public class Solution {

    public static int[] getConcatenation(int[] nums) {
        
    	int[] newArray = new int[nums.length * 2];
    	
    	for (int i = 0; i < newArray.length; i++) {
    		
    		newArray[i] = nums[i % nums.length];
    	}
    	
    	return newArray;
    }
    
    public static void main(String[] args) {
    	
    	int[] intput = {1,3,2,1};
    	
    	int[] output = Solution.getConcatenation(intput);
    	
    	for(int i = 0; i < output.length; i++) {
    		
    		System.out.print(output[i] + " / ");
    	}
    }
}