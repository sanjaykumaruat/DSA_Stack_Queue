package com.priorityQueue;

import java.util.PriorityQueue;

public class P3_KthLargestElement {

    public static int findKthLargest(int[] nums, int k) {

        // Min Heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.add(num);

            // Keep only k elements in heap
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // Top of heap is kth largest
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 1;

        System.out.println("Kth Largest = " + findKthLargest(nums, k));
    }
}
