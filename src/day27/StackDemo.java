package day27;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
	Stack<Integer> stack=new Stack();
	stack.add(10);
	stack.push(20);
	stack.push(30);
	stack.push(40);
	stack.push(50);
	
	System.out.println(stack);
	
	System.out.println(stack.pop());
	System.out.println(stack.isEmpty());

	}

}
