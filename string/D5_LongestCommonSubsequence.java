package com.string;

//package leetcode.medium;

public class D5_LongestCommonSubsequence {

    static int longestCommonSubsequence(String text1, String text2) {

        int[][] dp = new int[text1.length() + 1][text2.length() + 1];

        for (int i = 1; i <= text1.length(); i++) {
            for (int j = 1; j <= text2.length(); j++) {

                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[text1.length()][text2.length()];
    }

    public static void main(String[] args) {

        // Example 1
        String text1 = "abcde";
        String text2 = "ace";
        int result1 = longestCommonSubsequence(text1, text2);
        System.out.println("Input: text1 = \"" + text1 + "\", text2 = \"" + text2 + "\"");
        System.out.println("Output: " + result1);
        System.out.println("Explanation: The longest common subsequence is \"ace\" and its length is " + result1);
        System.out.println();

        // Example 2
        text1 = "abc";
        text2 = "abc";
        int result2 = longestCommonSubsequence(text1, text2);
        System.out.println("Input: text1 = \"" + text1 + "\", text2 = \"" + text2 + "\"");
        System.out.println("Output: " + result2);
        System.out.println("Explanation: The longest common subsequence is \"abc\" and its length is " + result2);
        System.out.println();

        // Example 3
        text1 = "abc";
        text2 = "def";
        int result3 = longestCommonSubsequence(text1, text2);
        System.out.println("Input: text1 = \"" + text1 + "\", text2 = \"" + text2 + "\"");
        System.out.println("Output: " + result3);
        System.out.println("Explanation: There is no such common subsequence, so the result is " + result3);
    }
}
