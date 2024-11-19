package day5;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		int ages[]=new int[5];
		Scanner sc=new Scanner(System.in);

//		ages[0]=18;
//		ages[1]=45;
//		ages[2]=33;
//		ages[3]=65;
//		ages[4]=10;
		int i;
		for(i=0;i<ages.length;i++)
		{
		System.out.println("enter a number"); //18);
		ages[i]=sc.nextInt();
		}

		int sum=0;
		for(i=0;i<ages.length;i++)
		{
			sum+=ages[i];
		}
		System.out.println(sum);
		
	}

}
