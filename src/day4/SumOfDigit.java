package day4;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number"); // 7
		int n = sc.nextInt();
		int r, sum = 0;
		while (n > 0) // 0>0F sum=6
		{
			r = n % 10;
			if(r%2==1)
			{
			sum = sum + r;
			}
			n = n / 10;
		}
		System.out.println(sum);
	}

}
