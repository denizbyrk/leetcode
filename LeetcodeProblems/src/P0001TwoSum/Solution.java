package P0001TwoSum;

public class Solution {
	
	public static int[] twoSum(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			
			for (int j = i + 1; j < nums.length; j++) {
				
				if (nums[i] + nums[j] == target) {

					int[] inputs = { i, j };
					return inputs;
				}
			}
		}

		return nums;
	}

	public static void main(String[] args) {

		int[] array = { 2, 5, 5, 11 };
		int target = 10;

		int[] output = twoSum(array, target);

		for (int x : output) {

			System.out.println(x);
		}
	}
}