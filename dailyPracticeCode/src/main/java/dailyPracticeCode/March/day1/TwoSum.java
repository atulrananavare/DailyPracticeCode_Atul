package dailyPracticeCode.March.day1;

import java.util.Iterator;

public class TwoSum {
	/*
	 * Input: nums = [2,7,11,15], target = 9 Output: [0,1] Explanation: Because
	 * nums[0] + nums[1] == 9, we return [0, 1].
	 */

	public static void main(String[] args) {
		int[] nums = { 2,  11, 15,7 };

		int[] output = twoSum(nums, 9);

		if (output != null) {
			for (int i : output) {
				System.out.println(i);
			}
		}
		else {
			System.out.println("No match found!");
		}

	}

	public static int[] twoSum(int[] nums, int target) {

		int[] arr = new int[2];

		int resultA = 0, resultB = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] + nums[j] == target && i != j) {
					resultA = i;
					resultB = j;
				}
			}

		}

		arr[0] = resultA;
		arr[1] = resultB;
		return arr;

	}

}
