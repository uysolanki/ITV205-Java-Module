package day22;

import java.util.Scanner;

public class WholesalerDriverApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter quantity");
		int qty=sc.nextInt();
		try
		{
			if(qty>=500)
				{
					System.out.println("Order Accepted");
				}
				else
				{
					throw new LowQuantityException("Please enter quantity > 500");
				}
		}
		catch(LowQuantityException e1)
		{
			System.out.println(e1.getMessage());
		}
		
		finally
		{
			System.out.println("Thank You! Visit Again");
		}

	}

}
