package day8;

import java.util.Scanner;

public class Student {

	private String emailID;
	private int rno;
	public String password;
	private long mobileNumber;

	public void acceptStudent() {
		Student akash=new Student(); 
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter email ID");  //ben@gmail.com
		this.emailID = sc.next();
		System.out.println("Please enter Roll Number"); //101
		this.rno = sc.nextInt();
		System.out.println("Please enter Password");  //alice123
		this.password = sc.next();
		System.out.println("Please enter mobile Number"); //8888877777
		this.mobileNumber = sc.nextLong();
	}

	public void displayStudent() {
		System.out.println("Email ID is " + this.emailID);
		System.out.println("Roll Number is " + this.rno);
		System.out.println("Password is " + this.password);
		System.out.println("Mobile Number is " + this.mobileNumber);
	}
}
