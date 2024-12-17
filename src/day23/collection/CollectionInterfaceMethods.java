package day23.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionInterfaceMethods {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList();
		a1.add("Alice"); //0
		a1.add("Ben");   //1
		a1.add("Chris"); //2
		a1.add("Frank"); //3
		a1.add("David"); //4
		a1.add("Henry"); //5
		
		System.out.println(a1);
		a1.add(2,"Tom");
		System.out.println("After Adding Tom " +a1);
		
		a1.remove("Frank");
		System.out.println("After removing Frank "+a1);
		
		a1.remove(3);
		System.out.println("After removing Chris at index 3 "+a1);
		
		System.out.println(a1.remove("Rajesh"));
//		String value=a1.get(2);
//		System.out.println(value);
//		System.out.println(a1);
//		
//		ArrayList<Integer> numbers=new ArrayList();
//		numbers.addAll(Arrays.asList(10, 20, 30, 40, 50));
//		
//		ArrayList<Integer> numbers1=new ArrayList(Arrays.asList(10, 20, 30, 40, 50));
//		
//		int sum=0;
//		for(int n:numbers)
//		{
//			sum+=n;
//		}
//		System.out.println(sum);
//		
//		sum=0;
//		for(int i=0;i<numbers.size();i++)
//		{
//			sum+=numbers.get(i);
//		}
//		System.out.println(sum);

	}

}
