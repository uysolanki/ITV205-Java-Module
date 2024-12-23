package day27;

import java.util.Scanner;
import java.util.Stack;

public class StackBracket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sequence of brackets");
		String input = sc.next();
		if (input.length() % 2 != 0) {
			System.out.println("Not Well Formed");
		} else {
			boolean result = checkValidity(input);
			if (result == true) {
				System.out.println("Well Formed");
			} else {
				System.out.println("Not Well Formed");
			}

		}
	}

	private static boolean checkValidity(String input) { // {[()]}
		Stack<Character> stack = new Stack();
		for (char c : input.toCharArray()) {
			if (c == '{' || c == '[' || c == '(') {
				stack.push(c);
				continue;
			}
			
			if (stack.isEmpty()) {
				return false;
			}
			
			char z = stack.pop(); // z={ c=}
			switch (c) {
			case ')':
				if (z != '(') {
					return false;
				}
				break;
			case ']':
				if (z != '[') {
					return false;
				}
				break;
			case '}':
				if (z != '{') {
					return false;
				}
				break;
			}
		}

		return stack.isEmpty();
	}

}
