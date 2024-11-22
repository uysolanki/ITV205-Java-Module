package day9;

public class LoginDriverApp {

	public static void main(String[] args) {
		Login l1=new Login();
		l1.setUsername("ben@gmail.com");
		System.out.println(l1.getUsername());
		
		
		l1.setAtmpin(8884);
		System.out.println(l1.getAtmpin());

	}

}
