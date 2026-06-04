package com.string;

import java.util.HashSet;
import java.util.Set;

public class D2_LongestSubstringWithoutRepeating {

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            // If duplicate found, move left pointer
            while (charSet.contains(s.charAt(right))) {
            	charSet.remove(s.charAt(left));
                left++;
            }

            charSet.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "pwwkewxpw";

        int result = lengthOfLongestSubstring(s);
        System.out.println("Input: s = \"" + s + "\"");
        System.out.println("Output: " + result);
    }
}
