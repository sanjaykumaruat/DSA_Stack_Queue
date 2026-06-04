package com.matrix;

public class SearchInSortedMatrix {
    public static boolean search(int[][] matrix, int target) {
        int rows = matrix.length, cols = matrix[0].length;
        int i = 0, j = cols - 1; // Start from top-right corner

        while (i < rows && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] > target) {
                j--; // Move left
            } else {
                i++; // Move down
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16}
        };
        int target = 4;
        System.out.println("Element Found: " + search(matrix, target));
    }
}
