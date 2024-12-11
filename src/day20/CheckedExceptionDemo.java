package day20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Please enter Student rno name and per sepeated by a ,");
		try
		{
		String userInput=br.readLine();
		}
		catch(IOException e1)
		{
			System.out.println("Some error occured");
		}
	}

}
