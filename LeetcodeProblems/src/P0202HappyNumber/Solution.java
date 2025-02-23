package P0202HappyNumber;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static boolean isHappy(int n) {

        List<Integer> existingNums = new ArrayList<Integer>();

        while (n != 1 && !existingNums.contains(n)) {
        	
        	existingNums.add(n);
            
            String nums = "" + n;
            char[] ints = nums.toCharArray();
            int result = 0;

            for (int i = 0; i < ints.length; i++) {
            	
                int a = Character.getNumericValue(ints[i]);
                
                result += a * a;
            }

            System.out.println(n);
            n = result;
        }

        if (n == 1) return true;
        return false;
	}

	public static void main(String[] args) {

		int input = 20;

		boolean output = Solution.isHappy(input);

		System.out.println(output);
	}
}