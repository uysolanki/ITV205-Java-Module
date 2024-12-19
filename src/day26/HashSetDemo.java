package day26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		String s1="Alice";
		String s2="Ben";
		String s3="Chris";
		//Student s4=new Student();
		
		System.out.println("S1 : "+ s1.hashCode());
		System.out.println("S2 : "+ s2.hashCode());
		System.out.println("S3 : "+ s3.hashCode());
		//System.out.println("S4 : "+ s4.hashCode());
		
		Set<String> names=new HashSet();
		names.add(s1);
		names.add(s2);
		names.add(s3);
		
		System.out.println(names.size());
		System.out.println(names);
		
		Integer n1=new Integer(10);
		Integer n2=new Integer(20);
		Integer n3=new Integer(30);
		
		System.out.println("N1 : "+ n1.hashCode());
		System.out.println("N2 : "+ n2.hashCode());
		System.out.println("N3 : "+ n3.hashCode());
		
		Set<Integer> numbers=new HashSet();   //No Args constructor - default capacity 16 default fill ratio 0.75
		numbers.add(n1);
		numbers.add(n2);
		numbers.add(n3);
		numbers.add(null);
		numbers.add(20);
		numbers.add(null);
		numbers.add(null);
		numbers.add(null);
		System.out.println(numbers);
		
		ArrayList<Integer> num1=new ArrayList(Arrays.asList(10,20,20,30,40,50,40));
		System.out.println(num1);
		
		Set<Integer> newNum=new HashSet(num1);
		System.out.println(newNum);
		
		
		Set<Integer> num3=new HashSet(5);
		num3.add(10);
		num3.add(20);
		num3.add(30);
		num3.add(30);
		num3.add(20);
		num3.add(40);
		num3.add(50);
		
		System.out.println(num3);
		System.out.println(num3.size());
		
		Set<Integer> num4=new HashSet(10,0.5f);  //user defined capacity =5, user defined fillratio = 0.5 i.e 50%
		
	}

}
