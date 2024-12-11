package day19;

import java.util.Scanner;

import day8.Student;

public class Test {

	public static void main(String[] args) {
			Student akash=new Student(); 
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter numerator");  //ben@gmail.com
			int n = sc.nextInt();
			System.out.println("Please enter denominator");  //ben@gmail.com
			int d = sc.nextInt();
			int result;
			try
			{
			result=n/d;
			System.out.println(result);
			}
			
			catch(ArithmeticException a1)
			{
				System.out.println("please enter valid denominator");
			}
			
			catch(Exception a1)
			{
				System.out.println("please enter valid denominator");
			}
			
			System.out.println("hi..");
			System.out.println("bye..");
			System.out.println("gn..");
			

	}

}
