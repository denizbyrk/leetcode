package P1470ShuffleTheArray;

public class Solution {

    public static int[] shuffle(int[] nums, int n) {
        
    	int[] result = new int[nums.length];
    	
    	int[] slice1 = new int[n];
    	int[] slice2 = new int[nums.length - n];
    	
    	int slice1iteration = 0;
    	int slice2iteration = 0;
    	
    	for (int i = 0; i < slice1.length; i++) {
    		
    		slice1[i] = nums[i];
    	}
    	
    	for (int i = 0; i < slice2.length; i++) {
    		
    		slice2[i] = nums[i + n];
    	}
    	
    	for (int i = 0; i < nums.length; i++) {
    		
    		if (i % 2 == 0) {
    			
    			result[i] = slice1[slice1iteration];
    			slice1iteration++;
    		} else {
    			
    			result[i] = slice2[slice2iteration];
    			slice2iteration++;
    		}
    	}
    	
    	return result;
    }
    
    public static void main(String[] args) {
    	
    	int[] array = {1,2,3,4,4,3,2,1};
    	int n = 4;
    	
    	int[] output = Solution.shuffle(array, n);
    	
    	for (int i = 0; i < output.length; i++) {
    		
    		System.out.print(output[i] + "/");
    	}
    }
}