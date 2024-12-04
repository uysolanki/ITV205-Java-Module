package day12;

import java.util.Scanner;

public class Player {
	int jno;				//instance / object scope
	String pname;
	int mp;
	int rs;
	
	static int strength;  //class scope
	static String titleSponsor="ItVedant";
	
	static
	{
		strength=30;
		titleSponsor="ITVedant";
	}
	
	public Player()  //NoArgsConstructor
	{
		jno=7;
		pname="Rahul";
		mp=1;
		rs=1;
		strength++;
	}
	
	public Player(int a, String b,int c,int d) //AllArgsConstructor
	{
		jno=a;
		pname=b;
		mp=c;
		rs=d;
		strength++;
	}
	
	public Player(Player temp) //copy constructor
	{
		jno=temp.jno;
		pname=temp.pname;
		mp=temp.mp;
		rs=temp.rs;
		strength++;
	}
	
	public void acceptPlayer()
	{
		int x;//local scope
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
	
	public static void displayStrength()
	{
		System.out.println("Total team strength is "+strength);
	}
	
}
