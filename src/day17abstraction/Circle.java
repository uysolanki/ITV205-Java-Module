package day17abstraction;

public class Circle implements Shape
{

	@Override
	public void area() {
		double result=3.14*5*5;
		System.out.println("Area of Circle "+result);
		
	}

	@Override
	public void perimeter() {
		double result=2*3.14*5;
		System.out.println("perimeter of Circle "+result);
		
	}

}
