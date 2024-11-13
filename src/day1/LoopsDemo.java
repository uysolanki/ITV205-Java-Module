package day1;

import java.util.Scanner;

public class LoopsDemo {

	public static void main(String[] args) {
		/*task1 : table of a number  x1 x2 .. x10
		task1 : 1-12 : all tables*/
		Scanner sc=new Scanner(System.in);
		
		for(int n=1;n<=12;n++)
		{
		System.out.println("-----Table "+n+"-------");
		printTable(n);
		
		}
	}

	private static void printTable(int n) {
		int result;
		for(int i=1;i<=10;i++)
		{
			result=i*n;
			System.out.println(n+ " X " +i+ " = " +result );	
		}
		
	}

}
