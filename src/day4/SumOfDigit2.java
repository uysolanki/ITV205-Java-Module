package day4;

import java.util.Scanner;

public class SumOfDigit2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number"); 
		int n = sc.nextInt();  //n=777
		int r,sum;
		
		while(n>9)
		n=sod(n);
		
		
		System.out.println("Sum is "+n);

	}

	public static int sod(int n)
	{
		int r;
		int sum = 0;
		while (n > 0) // 0>0F sum=6
		{
			r = n % 10;
			sum = sum + r;
			n = n / 10;
		}
		return sum;
	}
}
