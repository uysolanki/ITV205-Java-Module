package day25;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
	LinkedList<String> names=new LinkedList();
	
	names.add("Alice");
	names.add("Ben");
	names.add("Chris");
	names.add("David");
	
	System.out.println(names);
	names.addFirst("Aamir");
	names.addLast("Tom");
	
	System.out.println(names);
	System.out.println(names.peekFirst());
	
	System.out.println(names);
	
	System.out.println(names.pollFirst());
	System.out.println(names);

	}

}
