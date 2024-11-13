package day2;

import java.util.Scanner;

public class LoopDemo {

	public static void main(String[] args) {
		int i;
		int n;
		Scanner sc=new Scanner(System.in);
		int sum=0;
		for(i=1;i<=10;i++)
		{
			System.out.println("Enter number of chocs by student " + i);
			n=sc.nextInt();
			if(n>20)
			{
				continue;
			}
			if((i%2==0 && n%2==1) || (i%2==1 && n%2==0))
			{
				sum+=n;
				if(sum>=50)
				{
					break;
				}
			}
			
		}
		System.out.println("Total Collected" + sum);
		System.out.println("Submited to the principal" + (50));
		System.out.println("Surplus" + (sum-50));

	}

}
