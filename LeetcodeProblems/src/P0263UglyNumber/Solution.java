package P0263UglyNumber;

public class Solution {

	public static boolean isPrime(int n) {

		if (n < 2) return false;
		if (n == 2 || n == 3 || n == 5) return true; 

		for (int i = 2; i * i <= n; i++) {
			
			if (n % i == 0) {
				
				return false;
			}
		}

		return true;
	}

	public static boolean isUgly(int n) {

        if (n <= 0) return false;
        
        while (n % 2 == 0) n /= 2;
        while (n % 3 == 0) n /= 3;
        while (n % 5 == 0) n /= 5;

        if (n == 1) {
        	
        	return true;
        } else {
        	
        	return false;
        }
	}

	public static void main(String[] args) {

		int input = 14;

		boolean output = Solution.isUgly(input);

		System.out.println(output);
	}
}