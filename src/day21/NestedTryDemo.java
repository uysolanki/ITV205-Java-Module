package day21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTryDemo {

	public static void main(String[] args) { // 0 1
		int arr[] = new int[2]; // 10 0
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter Number for 0 index");
			arr[0] = sc.nextInt();
			System.out.println("Enter Number for 1 index");
			arr[1] = sc.nextInt();

			try {
				System.out.println("Enter index of Numerator");
				int nindex = sc.nextInt(); // 0
				int numerator = arr[nindex];
				System.out.println("Enter index of Denominator");
				int dindex = sc.nextInt(); // 1
				int denominator = arr[dindex];

				int result = numerator / denominator;
				System.out.println(result);
			} catch (ArithmeticException e1) {
				System.out.println("Deno cannot be zero");
			} catch (ArrayIndexOutOfBoundsException e2) {
				System.out.println("Enter Valid Index");
			}
		}

		catch (InputMismatchException e1) {
			System.out.println("Please enter valid numbers");
		}

	}

}
