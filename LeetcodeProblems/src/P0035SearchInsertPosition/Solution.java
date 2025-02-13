package P0035SearchInsertPosition;

public class Solution {

	public static int searchInsert(int[] nums, int target) {

		int index = -1;

		for (int i = 0; i <= nums.length; i++) {

			if (i != nums.length && nums[i] == target) {

				index = i;

			} else if (i == nums.length && nums[i - 1] < target) {

				index = nums.length;
			} else if (i == 0 && nums[i] > target) {

				index = 0;
			} else if (i > 0 && i < nums.length && nums[i - 1] < target && nums[i] > target) {

				index = i;
			}
		}

		return index;
	}

	public static void main(String[] args) {

		int[] numArray = { 1, 3, 5, 7 };
		int target = 8;

		int result = searchInsert(numArray, target);

		System.out.println(result);
	}
}