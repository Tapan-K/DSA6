package in.ineuron.assignment6;

public class MatrixSearchingQ2 {
	public static boolean searchMatrix(int[][] matrix, int target) {
		int m = matrix.length;
		int n = matrix[0].length;

		int left = 0;
		int right = m * n - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			int midElement = matrix[mid / n][mid % n];

			if (midElement == target) {
				return true;
			} else if (midElement < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		// Q.2
		int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		int target = 3;

		boolean found = searchMatrix(matrix, target);
		System.out.println("Target found: " + found);

	}

}
