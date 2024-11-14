package day3;

import java.util.Scanner;

public class PrimeNumber4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);			//n				//i
		System.out.println("enter a number");  		//7				  2
		int n=sc.nextInt();
		int flag=0;    //assume number is prime
		int loopCounter=0;
		for(int i=2;i<=n/2;i++)
		{
			loopCounter++;
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}
		System.out.println("Number of Iterations "+loopCounter);
	}

}
