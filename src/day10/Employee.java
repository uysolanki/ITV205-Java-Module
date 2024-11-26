package day10;

import java.util.Scanner;

public class Employee extends Person{
	private int eno;
	private String desg;
	private double salary;
	
	public void acceptEmployee()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter emp Number");  //ben@gmail.com
		this.eno= sc.nextInt();
		System.out.println("Please enter Designation"); //101
		this.desg= sc.next();
		System.out.println("Please enter Salary");  //alice123
		this.salary = sc.nextDouble();
	}
	
	public void displayEmployee()
	{
		System.out.println("emp Number is "+this.eno);  //ben@gmail.com
		System.out.println("Designation is "+this.desg);
		System.out.println("Salary is "+this.salary);
		
	}
}
