package day17abstraction.turfbusiness;

import java.beans.Customizer;
import java.util.Scanner;

public class TurfDriver {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		String customerName=sc.next();
		
		System.out.println("1. Football Turf");
		System.out.println("2. Cricket Turf");
		System.out.println("3. Tennis Turf");
		System.out.println("0. Exit");
		
		System.out.println("Enter Choice");
		int turfchoice=sc.nextInt();
		Turf t=null;
		switch(turfchoice)
		{
		case 1: 
			t=new FootballTurf();
			break;
		case 2:
			t=new CricketTurf();
			break;
		case 3: 
			t=new TennisTurf();
			break;
		case 0:
			System.exit(0);
		default:
			System.out.println("Invalid Input");
		}
		
		System.out.println("Hi, "+customerName + " You have chosen " + t.getTurfName() + ", Your total bill "+t.getTurfPrice());
		

	}

}
