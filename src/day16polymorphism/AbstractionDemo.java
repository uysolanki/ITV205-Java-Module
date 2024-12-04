package day16polymorphism;

public class AbstractionDemo {

	public static void main(String[] args) {
		Oneplus o1=new Oneplus();
		IphonePro o2=new IphonePro();
		o1.calling();
		o1.messaging();
		o1.photo();
		
		
		o2.calling();
		o2.messaging();
		o2.photo();
		o2.test();
	}

}
