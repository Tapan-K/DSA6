package in.ineuron.assignment6;

public class MountainArrayQ3 {
	public static boolean validMountainArray(int[] arr) {
		int n = arr.length;

		if (n < 3) {
			return false;
		}

		int i = 0;

		// Check the increasing part of the mountain
		while (i < n - 1 && arr[i] < arr[i + 1]) {
			i++;
		}

		// Check if there is a peak
		if (i == 0 || i == n - 1) {
			return false;
		}

		// Check the decreasing part of the mountain
		while (i < n - 1 && arr[i] > arr[i + 1]) {
			i++;
		}

		return i == n - 1;
	}

	public static void main(String[] args) {
		// Q.3
		int[] arr = { 2, 1 };
		boolean isValidMountain = validMountainArray(arr);

		System.out.println("Is valid mountain array: " + isValidMountain);

	}

}
