package day6;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		//int arr[]=new int[5];
		int arr[]= {18,  45,  16,   43,   19};
		Scanner sc=new Scanner(System.in);
		
//		System.out.println("Enter 5 Numbers");	 //             i
//												 //0	1 	2	3	4		5
//		for (int i = 0; i < arr.length; i++) {   //18  45  16   43   19
//			arr[i]=sc.nextInt();
//		}

		System.out.println("Enter Number to search");
		int s=sc.nextInt(); //43
		
		if(linearSer(arr, s)==-1)
		{
			System.out.println("NOT FOUND");
		}
		
	}
	
	public static int linearSer(int arr[],int s)
	{
		int i;
		for (i = 0; i < arr.length; i++) 
		{
			if(arr[i]==s)
			{
				System.out.println("FOUND at index "+i);
				return i;
			}
		}
		return -1;
	}
}
