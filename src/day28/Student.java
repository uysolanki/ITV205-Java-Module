package day28;

import java.util.Scanner;

public class Student {

	private String studName;
	private int rno;
	private int age;
	private long mobileNumber;

	public Student() {}
	
	public Student(String studName, int rno, int age, long mobileNumber) {
		this.studName = studName;
		this.rno = rno;
		this.age = age;
		this.mobileNumber = mobileNumber;
	}

	public void acceptStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter email ID");  //ben@gmail.com
		this.studName = sc.next();
		System.out.println("Please enter Roll Number"); //101
		this.rno = sc.nextInt();
		System.out.println("Please enter Age");  //alice123
		this.age = sc.nextInt();
		System.out.println("Please enter mobile Number"); //8888877777
		this.mobileNumber = sc.nextLong();
	}

	public void displayStudent() {
		System.out.println("Email ID is " + this.studName);
		System.out.println("Roll Number is " + this.rno);
		System.out.println("Age is " + this.age);
		System.out.println("Mobile Number is " + this.mobileNumber);
	}

	
	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Student [studName=" + studName + ", rno=" + rno + ", age=" + age + ", mobileNumber=" + mobileNumber
				+ "]";
	}

	
	
	
}
