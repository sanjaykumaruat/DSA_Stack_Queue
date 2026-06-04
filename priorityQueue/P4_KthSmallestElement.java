package com.priorityQueue;

import java.util.PriorityQueue;
import java.util.Collections;

public class P4_KthSmallestElement {

    public static int findKthSmallest(int[] nums, int k) {

        // Max Heap
        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        for (int num : nums) {
            maxHeap.add(num);

            // Keep only k elements
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        // Top of heap is kth smallest
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

        System.out.println("Kth Smallest = " + findKthSmallest(nums, k));
    }
}
