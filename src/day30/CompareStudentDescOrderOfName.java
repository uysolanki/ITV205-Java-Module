package day30;

import java.util.Comparator;

public class CompareStudentDescOrderOfName implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		return -o1.getStudName().compareTo(o2.getStudName());
	}

}
