package P0020ValidParentheses;

import java.util.Stack;

public class Solution {

	public static boolean isValid(String s) {

		Stack<Character> stack = new Stack<>();

		char[] characters = s.toCharArray();
		
		for (char bracket : characters) {
			
			switch (bracket) {
			
				case '(':
				case '[':
				case '{':
					stack.push(bracket);
					break;
				case ')':
					if (stack.isEmpty() || stack.pop() != '(') return false;
					break;
				case ']': 
					if (stack.isEmpty() || stack.pop() != '[') return false;
					break;
				case '}':
					if (stack.isEmpty() || stack.pop() != '{') return false;
					break;
			}
		}

		if (stack.isEmpty()) return true;
		
		return false;
	}

	public static void main(String[] args) {

		String input = "([)]";

		boolean output = Solution.isValid(input);

		System.out.println(output);
	}
}