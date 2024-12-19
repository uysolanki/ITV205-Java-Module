package day26;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Set<String> names=new LinkedHashSet();
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
