package day19;

import java.util.Scanner;

public class Student implements Cloneable
{

	private String emailID;
	private int rno;
	private String password;
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

	public Student() {}
	public Student(String emailID, int rno, String password, long mobileNumber) {
		this.emailID = emailID;
		this.rno = rno;
		this.password = password;
		this.mobileNumber = mobileNumber;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Student [emailID=" + emailID + ", rno=" + rno + ", password=" + password + ", mobileNumber="
				+ mobileNumber + "]";
	}
	
	@Override
	protected Student clone() throws CloneNotSupportedException {
		return (Student)super.clone();
	}
	
}
