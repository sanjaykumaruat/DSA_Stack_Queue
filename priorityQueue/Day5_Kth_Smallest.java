package com.priorityQueue;


import java.util.Arrays;

class Day5_Kth_Smallest {
  
    public static int kthSmallest(int[] arr, int k) {
        Arrays.sort(arr);
        System.out.println("array is after sort" + Arrays.toString(arr) );
        return arr[k - 1]; 
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15}; // Given array
        int k = 3; 
        
        int result = Day5_Kth_Smallest.kthSmallest(arr, k); // Call the function
        
        System.out.println("The " + k + "rd smallest element is: " + result);
        
    }
}
