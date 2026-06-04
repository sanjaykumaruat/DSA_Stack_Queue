package com.stack;

import java.util.Stack;
import java.util.Arrays;

public class Day7_DailyTemperatures {

    public static int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>(); // stores indices

        for (int i = 0; i < n; i++) {
            // While current temperature is warmer than stack top
            while (!stack.isEmpty() && temp[i] > temp[stack.peek()]) {
                int prevIndex = stack.pop();
                result[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] temp = {73, 74, 75, 71, 69, 72, 76, 73};

        int[] output = dailyTemperatures(temp);
        System.out.println("Daily Temperatures Output: " + Arrays.toString(output));
    }
}
