package com.string;


public class D4_SecondLongestUniformSubstring {

    public static void main(String[] args) {
        String str = "aaaabbccccd";

        int maxLen = 0, secondMaxLen = 0;
        char maxChar = 0, secondMaxChar = 0;
        int count = 1;

        for (int i = 1; i <= str.length(); i++) {

            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                char currentChar = str.charAt(i - 1);

                if (count > maxLen) {
                    secondMaxLen = maxLen;
                    secondMaxChar = maxChar;

                    maxLen = count;
                    maxChar = currentChar;
                } else if (count > secondMaxLen && count < maxLen) {
                    secondMaxLen = count;
                    secondMaxChar = currentChar;
                }
                count = 1;
            }
        }

        // Build second longest uniform substring
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < secondMaxLen; i++) {
            result.append(secondMaxChar);
        }

        System.out.println("Input: " + str);
        System.out.println("Second longest uniform substring = \"" + result + "\"");
    }
}
