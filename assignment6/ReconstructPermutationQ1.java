package in.ineuron.assignment6;

import java.util.*;

public class ReconstructPermutationQ1 {
	public static int[] findPermutation(String s) {
		int n = s.length();
		int[] perm = new int[n + 1];

		for (int i = 0; i <= n; i++) {
			perm[i] = i;
		}

		List<Integer> result = new ArrayList<>();

		// Reconstructing the permutation based on the string s
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'D') {
				// Reverse the elements in the subarray perm[i...j]
				int j = i;
				while (j < n && s.charAt(j) == 'D') {
					j++;
				}
				reverse(perm, i, j);
			}

			result.add(perm[i]);
		}

		result.add(perm[n]);

		// Convert the result list to an array
		int[] reconstructedPerm = new int[n + 1];
		for (int i = 0; i <= n; i++) {
			reconstructedPerm[i] = result.get(i);
		}

		return reconstructedPerm;
	}

	private static void reverse(int[] perm, int start, int end) {
		while (start < end) {
			int temp = perm[start];
			perm[start] = perm[end];
			perm[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		// Q.1
		String s = "IDID";
		int[] perm = findPermutation(s);

		System.out.println("Reconstructed permutation: " + java.util.Arrays.toString(perm));

	}

}
