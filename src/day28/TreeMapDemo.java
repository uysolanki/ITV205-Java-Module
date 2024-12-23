package day28;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
public static void main(String[] args) {
	Student s1=new Student("Virat", 18,33, 9890123123L);
	Student s2=new Student("Rohit", 45,37, 9890123124L);
	Student s3=new Student("Rahul", 1, 39, 9890123122L);
	Student s4=new Student("Hardik", 33, 18, 9890123120L);
	
	Map<String, Student> m100=new TreeMap();   //ascending order of keys
	m100.put("first", s2);
	m100.put("second", s1);
	m100.put("fourth", s4);
	m100.put("third", s3);
	
	System.out.println(m100);
}
}
