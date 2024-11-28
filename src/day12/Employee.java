package day12;

import java.util.Scanner;

public class Employee extends Person{
	private int eno;
	private String desg;
	private double salary;
	
	public Employee()
	{
		super();
		eno=101;
		desg="Manager";
		salary=800;
	}
	
	
	
	public Employee(long adharNumber, String name, long mobileNumber, String city,int eno, String desg, double salary) {
		super(adharNumber,name,mobileNumber,city);
		this.eno = eno;
		this.desg = desg;
		this.salary = salary;
	}



	public void acceptEmployee()
	{
		super.acceptPerson();
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
		super.displayPerson();
		System.out.println("emp Number is "+this.eno);  //ben@gmail.com
		System.out.println("Designation is "+this.desg);
		System.out.println("Salary is "+this.salary);
		
	}
}
