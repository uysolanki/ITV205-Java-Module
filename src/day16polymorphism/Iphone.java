package day16polymorphism;

public abstract class Iphone implements Mobile
{

	@Override
	public void calling() {
		System.out.println("Calling using iOS technology");
		
	}

	@Override
	public void messaging() {
		System.out.println("Messaging using iOS technology");
		
	}



}
