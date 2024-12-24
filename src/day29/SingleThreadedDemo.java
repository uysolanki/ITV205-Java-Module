package day29;

public class SingleThreadedDemo {

	public static void main(String[] args) {
		//display 1-26
		//display a-z
		for(int i=1;i<=26;i++)   //26 seconds
		System.out.println(i);
		
		for(char i='a';i<='z';i++) //26 seconds					total time : 52
			System.out.println(i);

	}

}
