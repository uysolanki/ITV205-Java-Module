package day29;

public class ThreadDriver {

	public static void main(String[] args) 	//thread-main
	{
		Numbers thread1=new Numbers();
		Alpha thread2=new Alpha();
		
		
		thread1.start();
		thread2.start();
		
		for (int i = 27; i <= 52; i++)
			System.out.println("  "+i);
		
	}

}
