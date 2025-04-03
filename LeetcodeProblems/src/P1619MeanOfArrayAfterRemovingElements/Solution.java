package P1619MeanOfArrayAfterRemovingElements;

import java.util.Arrays;

public class Solution {

    public static double trimMean(int[] arr) {
        
        Arrays.sort(arr);

        int removeCount = arr.length * 5 / 100;
        int count = arr.length - 2 * removeCount;
        int sum = 0;
        
        for (int i = removeCount; i < arr.length - removeCount; i++) {
        	
            sum += arr[i];
        }

        double result = (double)sum / count;
        
        return result;
    }
	
	public static void main(String[] args) {
		
		int[] arr = {6,0,7,0,7,5,7,8,3,4,0,7,8,1,6,8,1,1,2,4,8,1,9,5,4,3,8,5,10,8,6,6,1,0,6,10,8,2,3,4};
		
		double output = Solution.trimMean(arr);
		
		System.out.println(output);
	}
}