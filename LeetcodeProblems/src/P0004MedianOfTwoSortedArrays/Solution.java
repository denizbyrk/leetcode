package P0004MedianOfTwoSortedArrays;

import java.util.ArrayList;

public class Solution {

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

		double median = 0;

		int[] mergedArray = addArray(nums1, nums2);

		bubbleSort(mergedArray);

		if (mergedArray.length % 2 == 0) {

			int num1 = mergedArray[mergedArray.length / 2];
			int num2 = mergedArray[mergedArray.length / 2 - 1];

			median = ((double) num1 + (double) num2) / 2;

			return median;

		} else if (mergedArray.length % 2 == 1) {

			median = mergedArray[mergedArray.length / 2];

			return median;
		}

		return median;
	}

	public static int[] addArray(int[] a, int[] b) {

		ArrayList<Integer> resultList = new ArrayList<>();

		for (int num : a) {
			resultList.add(num);
		}

		for (int num : b) {
			resultList.add(num);
		}

		return resultList.stream().mapToInt(Integer::intValue).toArray();
	}

	public static void bubbleSort(int[] arr) {

		int n = arr.length;
		int temp = 0;

		for (int i = 0; i < n; i++) {

			for (int j = 1; j < (n - i); j++) {

				if (arr[j - 1] > arr[j]) {

					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {

		int[] arr1 = { 1, 3 };
		int[] arr2 = { 2, 4, 6 };

		double median = findMedianSortedArrays(arr1, arr2);

		System.out.println(median);
	}
}