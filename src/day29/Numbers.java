package day29;

public class Numbers extends Thread
{
	@Override
	public void run()   //task the thread will perform
	{
		for(int i=1;i<=26;i++)
			System.out.println(" "+i);
	}
}
