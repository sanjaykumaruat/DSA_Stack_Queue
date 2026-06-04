package com.matrix;
public class Day1_MatrixMultiplication {
    public static void main(String[] args) {
        // Define the matrices
        int arr1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int arr2[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        // Get the number of rows and columns
        int rows = arr1.length;
        int cols = arr2[0].length;
        int common = arr1[0].length; // This should match arr2.length

        // Result matrix
        int result[][] = new int[rows][cols];

        // Perform matrix multiplication
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = 0;
                for (int k = 0; k < common; k++) {
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        // Print the result
        System.out.println("Resultant Matrix after Multiplication:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
