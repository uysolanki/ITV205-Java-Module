package day11;

import java.util.Scanner;

public class Player {
	int jno;
	String pname;
	int mp;
	int rs;
	
	public Player()
	{
		jno=7;
		pname="Rahul";
		mp=1;
		rs=1;
	}
	
	public Player(int a, String b,int c,int d)
	{
		jno=a;
		pname=b;
		mp=c;
		rs=d;
	}
	
	public Player(Player temp)
	{
		jno=temp.jno;
		pname=temp.pname;
		mp=temp.mp;
		rs=temp.rs;
	}
	
	public void acceptPlayer()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Jersey Number");  //18
		this.jno= sc.nextInt();
		System.out.println("Please enter Player Name"); //Virat
		this.pname= sc.next();
		System.out.println("Please enter Matches Played");  //100
		this.mp = sc.nextInt();
		System.out.println("Please enter Runs Scored"); //10000
		this.rs = sc.nextInt();
	}

	@Override
	public String toString() {
		return "Player [jno=" + jno + ", pname=" + pname + ", mp=" + mp + ", rs=" + rs + "]";
	}
	
}
