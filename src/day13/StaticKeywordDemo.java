package day13;

import static java.lang.Math.*;
public class StaticKeywordDemo {
	static int x=10;
	public static void main(String[] args) {
		StaticKeywordDemo t1=new StaticKeywordDemo();
		t1.display();	
	}
	void display()
	{
		System.out.println("ITV");
		System.out.println(sqrt(100));
		System.out.println(sin(90));
		System.out.println(PI*5*5);
	}
}
