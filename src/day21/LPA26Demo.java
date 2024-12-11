package day21;

public class LPA26Demo {
public static void main(String[] args) {
	
	boolean result=test();
	System.out.println(result);
}

private static boolean test() {

		
		try
		{
		int ans=10/0;
		return true;
		}
		catch(ArithmeticException e1)
		{
			return false;
		}
		finally 
		{
			return true;
		}
		
}
}
