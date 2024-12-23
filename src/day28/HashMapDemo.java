package day28;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		//eno ename
		
		Map<Integer,String> employees=new HashMap();
		employees.put(101, "Chris");
		employees.put(102, "Alice");
		employees.put(103, "Ben");
		
		System.out.println(employees);
		
		
		Student s1=new Student("Virat", 18,33, 9890123123L);
		Student s2=new Student("Rohit", 45,37, 9890123124L);
		Student s3=new Student("Rahul", 1, 39, 9890123122L);
		
		Map<String, Student> m100=new HashMap();
		m100.put("first", s2);
		m100.put("second", s1);
		m100.put("third", s3);
		
		System.out.println(m100);
		//display the name of the student who has come first?
		System.out.println(m100.get("first").getStudName());
		//display the age of the student who has come third?
		System.out.println(m100.get("third").getAge());
		
		System.out.println(m100.containsKey("first"));
		System.out.println("before adding fourth key " +m100.containsKey("fourth"));
		m100.put("fourth", s3);
		System.out.println("after adding fourth key " +m100.containsKey("fourth"));
		
		Student s4=new Student("Rajesh", 13, 28, 9890123120L);
		m100.put("first", s4);
		System.out.println(m100);
	}

}
