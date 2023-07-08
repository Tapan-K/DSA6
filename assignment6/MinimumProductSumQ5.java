package in.ineuron.assignment6;

import java.util.Arrays;

public class MinimumProductSumQ5 {
	public static int minProductSum(int[] nums1, int[] nums2) {
		int n = nums1.length;

		Arrays.sort(nums1);
		Arrays.sort(nums2);
		reverse(nums2);

		int minProductSum = 0;

		// Calculating the product sum
		for (int i = 0; i < n; i++) {
			minProductSum += nums1[i] * nums2[i];
		}

		return minProductSum;
	}

	private static void reverse(int[] nums) {
		int left = 0;
		int right = nums.length - 1;

		while (left < right) {
			int temp = nums[left];
			nums[left] = nums[right];
			nums[right] = temp;

			left++;
			right--;
		}
	}

	public static void main(String[] args) {
		// Q.5
		int[] nums1 = { 5, 3, 4, 2 };
		int[] nums2 = { 4, 2, 2, 5 };

		int minProduct = minProductSum(nums1, nums2);

		System.out.println("Minimum product sum: " + minProduct);

	}

}
