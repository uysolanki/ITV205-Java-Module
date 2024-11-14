package day3;

import java.util.Scanner;

public class PrimeNumber1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");  //7
		int n=sc.nextInt();
		int counter=0;
		int loopCounter=0;
		for(int i=1;i<=n;i++)
		{
			loopCounter++;
			if(n%i==0)					//n				i			counter=0
			{							//7				1			1
				counter++;				//7				2			1
			}							//7				3			1
		}								//7				4			1
		if(counter==2)					//7				5			1
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}
		System.out.println("Number of Iterations "+loopCounter);
	}									//7				6			1
										//7				7			2
										//7				8
}
