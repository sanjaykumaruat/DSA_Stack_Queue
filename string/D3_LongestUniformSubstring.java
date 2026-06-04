package com.string;

public class D3_LongestUniformSubstring {

    public static void main(String[] args) {
        String str = "aaabbccccd";

        int maxLen = 0;
        char maxChar = 0;
        int count = 1;

        for (int i = 1; i <= str.length(); i++) {

            // Count consecutive characters
            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                if (count > maxLen) {
                    maxLen = count;
                    maxChar = str.charAt(i - 1);
                }
                count = 1;
            }
        }

        // Build result WITHOUT helper method
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < maxLen; i++) {
            result.append(maxChar);
        }

        System.out.println("Input: " + str);
        System.out.println("Longest uniform substring = \"" + result + "\"");
    }
}

