package day10;

import java.util.Scanner;

public class Person {
	protected long adharNumber;
	protected String name;
	protected long mobileNumber;
	protected String city;
	
	public void acceptPerson()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter adharNumber");  //ben@gmail.com
		this.adharNumber= sc.nextLong();
		System.out.println("Please enter Name"); //101
		this.name= sc.next();
		System.out.println("Please enter mobile Number");  //alice123
		this.mobileNumber = sc.nextLong();
		System.out.println("Please enter city"); //8888877777
		this.city = sc.next();
	}
	
	public void displayPerson()
	{
		System.out.println("AdharNumber is "+this.adharNumber);  //ben@gmail.com
		System.out.println("Name is "+this.name);
		System.out.println("Mobile Number is "+this.mobileNumber);
		System.out.println("City is "+this.city);
	}

}