package day6;

import java.util.Scanner;

public class NestedForLoopDemo {

	public static void main(String[] args) {
		
		//1	2 3	4
		//1 2 3
		//1 2 
		//1	
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--)  //count of rows
		{
			for(int j=1;j<=i;j++)//count of cols
			{
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}

}
