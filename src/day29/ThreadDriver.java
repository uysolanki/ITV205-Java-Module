package day29;

public class ThreadDriver {

	public static void main(String[] args) 	//thread-main
	{
		Numbers thread1=new Numbers();
		Alpha thread2=new Alpha();
		
		Thread tx=new Thread(thread2);
		
		thread1.start();
		tx.start();
		
		for (int i = 27; i <= 52; i++)
			System.out.println("  "+i);
		thread1.stop();
	}

}
