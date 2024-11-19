package day6;

import java.util.Arrays;

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

	}

}
