package day21;

public class ArrayIndexOutOfBoundsExceptionDemo {

	public static void main(String[] args) {
		int arr[]= {20,4};
		try
		{
		System.out.println(arr[1]);
		System.out.println(arr[0]);
		
		int result=arr[0]/arr[1];
		System.out.println(result);
		}
		catch(ArithmeticException|ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("Invalid Input");
		}

	}

}
