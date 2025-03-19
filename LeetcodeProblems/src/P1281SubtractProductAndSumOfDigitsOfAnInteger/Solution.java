package P1281SubtractProductAndSumOfDigitsOfAnInteger;

public class Solution {

	public static int subtractProductAndSum(int n) {

		String s = "" + n;
		char[] digits = s.toCharArray();
		int sum = 0;
		int product = 1;
		int diff = 0;

		for (int i = 0; i < digits.length; i++) {

			sum += Integer.parseInt(Character.toString(digits[i]));
			product *= Integer.parseInt(Character.toString(digits[i]));
		}

		diff = product - sum;

		return diff;
	}

	public static void main(String[] args) {

		int n = 234;

		int output = Solution.subtractProductAndSum(n);

		System.out.println(output);
	}
}