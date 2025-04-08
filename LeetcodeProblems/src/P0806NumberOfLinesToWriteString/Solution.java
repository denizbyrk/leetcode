package P0806NumberOfLinesToWriteString;

import java.util.Arrays;

public class Solution {

    public static int[] numberOfLines(int[] widths, String s) {
    	
        int lines = 1;
        int pixels = 0;

        for (char c : s.toCharArray()) {
        	
            int width = widths[c - 'a'];

            if (pixels + width > 100) {
            	
                lines++;
                pixels = width;
                
            } else {
            	
            	pixels += width;
            }
        }

        int[] result = {lines, pixels};
        
        return result;
    }
	
	public static void main(String[] args) {
		
		int[] widths = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
		
		String s = "abcdefghijklmnopqrstuvwxyz";
		
		int[] output = Solution.numberOfLines(widths, s);
		
		System.out.println(Arrays.toString(output));
	}
}