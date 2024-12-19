package day25;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Student> names=new LinkedList();//default capacity=10
		
		Student s1=new Student("alice@gmail.com", 101, "abc123", 9890123123L);
		Student s2=new Student("ben@gmail.com", 102, "ben123", 9890123124L);
		Student s3=new Student("chris@gmail.com", 103, "chris123", 9890123125L);
		//Student s4=new Student("david@gmail.com", 104, "david123", 9890123126L);
		
		names.add(s1);
		names.add(s2);
		names.add(s3);
		//names.add(s4);
		names.add(new Student("david@gmail.com", 104, "david123", 9890123126L));
		//capacity=10 size=4
		//display all the emails from this list
		for(int i=0;i<names.size();i++)
		{
			System.out.println(names.get(i).getEmailID());
		}
		List<String> players=new ArrayList();
		
		List names3=new LinkedList(players);
		names3.add("Jack");
		names3.add("John");
		
		List names4=new ArrayList(names3);
		
		

	}

}
