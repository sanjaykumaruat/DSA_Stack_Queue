package com.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class D1b_First_Non_Repeating_Character {
    public static void main(String[] args) {
        String str = "swiss";

        // Using LinkedHashMap to maintain insertion order
        Map<Character, Integer> map = new LinkedHashMap<>();

        // Count frequency of each character
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Find first character with count 1
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeating character: " + entry.getKey());
                return;
            }
        }

        System.out.println("No non-repeating character found.");
    }
}
