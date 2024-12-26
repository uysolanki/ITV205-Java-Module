package day29;

public class Alpha implements Runnable {
	@Override
	public void run() {
		for (char i = 'a'; i <= 'z'; i++)
			System.out.println(i);
	}
}
