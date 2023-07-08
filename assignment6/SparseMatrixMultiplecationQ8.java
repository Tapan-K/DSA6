package in.ineuron.assignment6;

import java.util.Arrays;

public class SparseMatrixMultiplecationQ8 {
	public static int[][] multiplySparseMatrices(int[][] mat1, int[][] mat2) {
		int m = mat1.length;
		int k = mat1[0].length;
		int n = mat2[0].length;

		int[][] result = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				for (int x = 0; x < k; x++) {
					result[i][j] += mat1[i][x] * mat2[x][j];
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat1 = { { 1, 0, 0 }, { -1, 0, 3 } };
		int[][] mat2 = { { 7, 0, 0 }, { 0, 0, 0 }, { 0, 0, 1 } };

		int[][] result = multiplySparseMatrices(mat1, mat2);

		// Print the result
		for (int[] row : result) {
			System.out.println(Arrays.toString(row));
		}

	}

}
