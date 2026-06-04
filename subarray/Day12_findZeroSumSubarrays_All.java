package com.subarray;

import java.util.*;

public class Day12_findZeroSumSubarrays_All {

    // Method to print all subarrays with sum = 0
    public static void findZeroSumSubarrays(int[] arr) {
        // Map to store prefix sum and corresponding list of indices
        Map<Integer, List<Integer>> sumMap = new HashMap<>();   
        int sum = 0;

        // Initialize: sum 0 occurs at index -1
        sumMap.put(0, new ArrayList<>());
        sumMap.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {
            sum = sum+ arr[i]; // Calculate prefix sum

            // If this sum has been seen before
            if (sumMap.containsKey(sum)) {
                for (int start : sumMap.get(sum)) {
                    System.out.println("Subarray from index " + (start + 1) + " to " + i);
                }
            }

            // Add current index to the list of indices for this sum
            sumMap.putIfAbsent(sum, new ArrayList<>());
            sumMap.get(sum).add(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -3, 4, -1, -3, 1};

        System.out.println("Zero-sum subarrays:");
        findZeroSumSubarrays(arr);
    }
}

