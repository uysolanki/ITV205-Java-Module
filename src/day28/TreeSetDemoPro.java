package day28;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemoPro {

	public static void main(String[] args) {
		Set<Student> students=new TreeSet();
		Student s1=new Student("Virat", 18,33, 9890123123L);
		Student s2=new Student("Rohit", 45,17, 9890123124L);
		Student s3=new Student("Rahul", 1, 39, 9890123122L);
		
		students.add(s1);
		students.add(s2);
		students.add(s3);

		System.out.println(students);
	}

}
