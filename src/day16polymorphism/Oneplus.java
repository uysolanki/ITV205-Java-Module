package day16polymorphism;

public class Oneplus implements Mobile
{

	@Override
	public void calling() {
		System.out.println("Calling using Android Tech");
		
	}

	@Override
	public void messaging() {
		System.out.println("Messaging using Android Tech");
		
	}

	@Override
	public void photo() {
		System.out.println("Photo using Android Tech");
		
	}

}
