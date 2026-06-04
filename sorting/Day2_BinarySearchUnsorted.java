package com.sorting;

import java.util.Arrays;

public class Day2_BinarySearchUnsorted {
	public static int binarySearch(int[] arr, int x) {
		Arrays.sort(arr); // Step 1: Sort the array first
		int left = 0;
	    int	right = arr.length - 1;
		

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] == x)
				return mid; // Element found
			else if (arr[mid] < x)
				left = mid + 1;
			else
				right = mid - 1;
		}
		return -1; // Element not found
	}

	public static void main(String[] args) {
		int[] arr = { 7, 2, 9, 4, 1, 5 }; // Unsorted array
		int x = 4;

		int result = binarySearch(arr, x);
		System.out.println("Element found at index: " + result);
	}
}
