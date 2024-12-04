package day16polymorphism;

public class OverloadingDemo {

	public double area(int radius)
	{
		return Math.PI*radius*radius;
	}
	
	public double area(int length,int width)
	{
		return length*width;
	}
	public static void main(String[] args) {
		OverloadingDemo obj1=new OverloadingDemo();
		System.out.println("Area of Circle "+obj1.area(5));
		System.out.println("Area of Rectangle "+obj1.area(5,10));

	}

}
