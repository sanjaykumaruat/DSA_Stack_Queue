package com.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement1 {

    private int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Map<Integer, Integer> numberNGE = new HashMap<>();
        Stack<Integer> numStack = new Stack<>();

        // Build Next Greater Element map using nums2
        for (int num : nums2) {

            while (!numStack.isEmpty() && numStack.peek() < num) {
                numberNGE.put(numStack.pop(), num);
            }
            numStack.push(num);
        }

        // Remaining elements have no next greater element
        while (!numStack.isEmpty()) {
            numberNGE.put(numStack.pop(), -1);
        }

        // Prepare result for nums1
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = numberNGE.get(nums1[i]);
        }

        return result;
    }

    public static void main(String[] args) {

        // Given Example Input
        int[] nums1 = {2, 4};
        int[] nums2 = {1, 2, 3, 4};

        NextGreaterElement1 obj = new NextGreaterElement1();
        int[] result = obj.nextGreaterElement(nums1, nums2);

        System.out.print("Output: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
