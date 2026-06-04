package com.string;

//File: FirstRepeatingChar.java
import java.util.HashSet;
import java.util.Set;

public class D1a_FirstRepeatingChar {
 public static void main(String[] args) {
     String str = "programming";
     Set<Character> set = new HashSet<>();

     for (char ch : str.toCharArray()) {
         if (set.contains(ch)) {
             System.out.println("First repeating character: " + ch);
             return;
         } else {
             set.add(ch);
         }
     }

     System.out.println("No repeating character found.");
 }
}
