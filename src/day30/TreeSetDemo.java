package day30;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<Student> sportsStudents=new TreeSet(new CompareStudentAscOrderOfAge());  //asc order of age
		Student s1=new Student("Virat", 18,33, 9890123123L);
		Student s2=new Student("Rohit", 45,17, 9890123124L);
		Student s3=new Student("Rahul", 1, 39, 9890123122L);
		
		sportsStudents.add(s1);
		sportsStudents.add(s2);
		sportsStudents.add(s3);

		System.out.println("----Sports Students-----");
		for(Student s:sportsStudents)
		System.out.println(s);
		
		
		Set<Student> academicStudents=new TreeSet(new CompareStudentDescOrderOfName()); //desc order of name
		Student s4=new Student("Virat", 63,33, 9890123123L);
		Student s5=new Student("Rohit", 37,17, 9890123124L);
		Student s6=new Student("Rahul", 94, 39, 9890123122L);
		
		academicStudents.add(s4);
		academicStudents.add(s5);
		academicStudents.add(s6);

		System.out.println("----Academic Students-----");
		for(Student s:academicStudents)
		System.out.println(s);
		
		
//		Set<Integer> numbers=new TreeSet<Integer>();
//		numbers.add(19);
//		numbers.add(15);
//		numbers.add(23);
//		numbers.add(12);
//		
//		System.out.println(numbers);
	}

}
