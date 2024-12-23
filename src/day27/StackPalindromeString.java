package day27;

import java.util.Scanner;
import java.util.Stack;

public class StackPalindromeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String inputString=sc.next();       //madam
		
		Stack<Character> stack=new Stack();
		for(char c:inputString.toCharArray())
			stack.push(c);
		
		System.out.println(stack);
		int flag=0;
		for(char c:inputString.toCharArray()) //c = 'a' 
		{
			if(c!=stack.pop())
			flag=1;
			break;
		}
		
//		if(flag==1)
//		{
//			System.out.println("NOT a Palindrome");
//		}
//		else
//		{
//			System.out.println("Palindrome");
//		}
		
		System.out.println(flag==1?"NOT a Palindrome":"Palindrome");
	}

}
