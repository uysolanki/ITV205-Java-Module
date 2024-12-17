package day22;

import java.util.Scanner;

public class NameDriverApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first name");
		String name=sc.nextLine();
		
		try
		{
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)==' ')
			{
				throw new InvalidNameException("Invalid Name");
			}
		}
		System.out.println("Valid Name");
		}
		catch(InvalidNameException e1)
		{
			System.out.println(e1.getMessage());
		}

	}

}
