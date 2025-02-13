package P0007ReverseInteger;

public class Solution {

	public static int reverse(int x) {

		boolean isNegative = false;

		if (x < 0) {

			isNegative = true;
		}

		String numberInString = String.valueOf(x);
		String newValue = "";

		if (isNegative == true) {

			numberInString = numberInString.substring(1);
		}

		for (int i = numberInString.length() - 1; i >= 0; i--) {

			newValue += numberInString.charAt(i);
		}

		try {

			x = Integer.parseInt(newValue);

		} catch (NumberFormatException e) {

			return 0;
		}

		if (isNegative == true) {

			x = -x;
		}

		return x;
	}

	public static void main(String[] args) {

		int numberToReverse = -14423145;

		numberToReverse = reverse(numberToReverse);

		System.out.println(numberToReverse);
	}
}