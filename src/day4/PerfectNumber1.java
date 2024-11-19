package day4;

import java.util.Scanner;

public class PerfectNumber1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");  //7
		int n=sc.nextInt();
		int i;
		int sum=0;
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		
		if(sum==n)
		{
			System.out.println("Perfect");
		}
		else
		{
			System.out.println("Not Perfect");
		}

	}

}
