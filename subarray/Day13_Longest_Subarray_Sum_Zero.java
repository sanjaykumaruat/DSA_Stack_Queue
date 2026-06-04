package com.subarray;


import java.util.HashMap;
import java.util.Map;

public class Day13_Longest_Subarray_Sum_Zero {

    public static void findLongestZeroSumSubarray(int[] arr) {
        // Map to store sum and its earliest index
        Map<Integer, Integer> sumMap = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        int startIndex = -1;
        int endIndex = -1;

        sumMap.put(0, -1); // For subarray starting from index 0

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sumMap.containsKey(sum)) {
                int prevIndex = sumMap.get(sum);
                int length = i - prevIndex;

                if (length > maxLen) {
                    maxLen = length;
                    startIndex = prevIndex + 1;
                    endIndex = i;
                }
            } else {
                sumMap.put(sum, i); // store first occurrence of this sum
            }
        }

        if (maxLen > 0) {
            System.out.println("Longest subarray with sum 0 is from index " + startIndex + " to " + endIndex);
            System.out.println("Length of longest subarray with sum 0: " + maxLen);
        } else {
            System.out.println("No subarray with sum 0 found.");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 2, 3, -3, 7, -5};
        findLongestZeroSumSubarray(arr);
    }
}
