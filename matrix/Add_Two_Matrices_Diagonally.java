package com.matrix;



public class Add_Two_Matrices_Diagonally {
    public static void main(String[] args) {
        int[][] arr1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] arr2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int n = arr1.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr1[i][i] + arr2[i][i];  // Main diagonal
            if (i != n - 1 - i) {  
                sum += arr1[i][n - 1 - i] + arr2[i][n - 1 - i];  // Secondary diagonal
            }
        }

        System.out.println("Diagonal sum: " + sum);
    }
}
