package day26;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
			Set<String> names=new TreeSet();		//arrange data in Asc order
			names.add("Alice");
			names.add("Frank");
			names.add("Ben");
			names.add("Chris");
			names.add("John");
			names.add("David");
			names.add("Alice");
			
			System.out.println(names);

	}

}
