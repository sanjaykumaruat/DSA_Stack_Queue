package com.stack;

import java.util.Stack;

class Day1_isParenthesisBalanced {
	public static void main(String[] args) {
		String str = "[{()}]"; // Example input
		boolean result = isParenthesisBalanced(str);
		System.out.println("Is the string balanced? " + result);
	}

	static boolean isParenthesisBalanced(String str) {
		Stack<Character> stack = new Stack<>();

		for (char c : str.toCharArray()) {
			if (c == '(') {
				stack.push(')');
			} else if (c == '{') {
				stack.push('}');  
			} else if (c == '[') {
				stack.push(']');
			} else if (stack.isEmpty() || stack.pop() != c) {
				return false; // Unbalanced or mismatched bracket
			}
		}
		return stack.isEmpty(); // Stack should be empty if balanced
	}
}
