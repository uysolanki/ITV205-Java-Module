package day20;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsDemo {

	public static void main(String[] args) {
		try
		{
		double ans=divide();
		System.out.println(ans);
		}
		catch(Exception e1) {}

	}

	private static double divide() throws SQLException,InputMismatchException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter numerator");  //ben@gmail.com
		int n = sc.nextInt();
		System.out.println("Please enter denominator");  //ben@gmail.com
		int d = sc.nextInt();
		return n/d;	
	}

}
