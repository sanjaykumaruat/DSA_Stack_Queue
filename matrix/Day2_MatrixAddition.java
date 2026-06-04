package com.matrix;

public class Day2_MatrixAddition {

	public static void main(String[] args) {

		int arr1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int arr2[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int rows = arr1.length;
		int columns = arr1[0].length;
		int arr3[][] = new int[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				arr3[i][j] = arr1[i][j] + arr2[i][j];
			}
		}

		// Printing the result array arr3
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();// New line after each row
		}
	}
}
