package in.ineuron.assignment6;

public class SpiralMatrixGenQ7 {
	public static int[][] generateSpiralMatrix(int n) {
		int[][] matrix = new int[n][n];
		int num = 1;
		int top = 0, bottom = n - 1, left = 0, right = n - 1;

		while (num <= n * n) {
			// Traverse left to right
			for (int i = left; i <= right; i++) {
				matrix[top][i] = num++;
			}
			top++;

			// Traverse top to bottom
			for (int i = top; i <= bottom; i++) {
				matrix[i][right] = num++;
			}
			right--;

			// Traverse right to left
			for (int i = right; i >= left; i--) {
				matrix[bottom][i] = num++;
			}
			bottom--;

			// Traverse bottom to top
			for (int i = bottom; i >= top; i--) {
				matrix[i][left] = num++;
			}
			left++;
		}

		return matrix;
	}

	public static void main(String[] args) {
		// Q.7
		int n = 3;
		int[][] spiralMatrix = generateSpiralMatrix(n);

		// Printing the generated spiral matrix
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(spiralMatrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}
