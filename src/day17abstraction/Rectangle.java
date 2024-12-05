package day17abstraction;

public abstract class Rectangle implements Shape
{

	@Override
	public void area() {
		int result=5*10;
		System.out.println("Area of Rectangle is "+result);
		
	}

//	@Override
//	public void perimeter() {
//		int result=2*(5+10);
//		System.out.println("Perimeter of Rectangle is "+result);
		
//	}

}
