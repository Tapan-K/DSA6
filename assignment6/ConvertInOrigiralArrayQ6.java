package in.ineuron.assignment6;

import java.util.*;

public class ConvertInOrigiralArrayQ6 {
	public static int[] findOriginal(int[] changed) {
		Map<Integer, Integer> countMap = new HashMap<>();

		for (int num : changed) {
			countMap.put(num, countMap.getOrDefault(num, 0) + 1);
		}

		List<Integer> original = new ArrayList<>();

		// Traverse the changed array to find the original elements
		for (int num : changed) {
			if (countMap.containsKey(num * 2)) {

				original.add(num);

				countMap.put(num * 2, countMap.get(num * 2) - 1);

				if (countMap.get(num * 2) == 0) {
					countMap.remove(num * 2);
				}
			} else {
				// changed is not a doubled array, return an empty array
				return new int[0];
			}
		}

		// Convert the original list to an array
		int[] originalArray = new int[original.size()];
		for (int i = 0; i < original.size(); i++) {
			originalArray[i] = original.get(i);
		}

		return originalArray;
	}

	public static void main(String[] args) {
		// Q.6
		int[] changed = { 1, 3, 4, 2, 6, 8 };
		int[] original = findOriginal(changed);

		System.out.println("Original array: " + java.util.Arrays.toString(original));

	}

}
