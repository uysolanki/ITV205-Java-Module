package day6;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6,7,8,9};  // 6,7,8,9,2,3,4,5
									   // 
									  //temp=2   
		 							  //	3,4,5,6,7,8,9,2
		System.out.println(Arrays.toString(arr)); //{2,3,4,5,6,7,8,9}
		int mid=arr.length/2;
		int temp;
		for(int i=0;i<mid;i++)
		{
			temp=arr[0];
			int j;
			for(j=0;j<arr.length-1;j++)
			{
				arr[j]=arr[j+1];
			}
			arr[j]=temp;
		}
		System.out.println(Arrays.toString(arr));	//{6,7,8,9,2,3,4,5}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number to Search");
		int s=sc.nextInt();	
		
		int foundIndex;
		if(s>=arr[0])
		{
			foundIndex=binarySearch(arr,0,(arr.length-1)/2, s);	
		}
		else
		{
			foundIndex=binarySearch(arr,((arr.length-1)/2)+1,arr.length-1, s);	
		}
		
		if(foundIndex==-1)
		{
			System.out.println("Number Not Found");
		}
		else
		{
			System.out.println("Number Found at index "+foundIndex);
		}
	}
	
	private static int binarySearch(int arr[],int start, int end, int s) {
		int mid;
		while(start<=end)
		{
			mid=(start+end)/2;			
			if(arr[mid]==s)
			{
				return mid;
			}
			else if(s>arr[mid])
			{
				start=mid+1;
			}
			else
			{
				end =mid-1;
			}
		}
		
			return -1;
		
	}

}
