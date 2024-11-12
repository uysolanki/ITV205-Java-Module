package day1;

public class StringFormatDemo {

	public static void main(String[] args) {
		System.out.println(String.format("%-15s", "Tie") + String.format("%5d", 500));
		System.out.println(String.format("%-15s", "Belt")+ String.format("%5d", 1500));
		System.out.println(String.format("%-15s", "Shoes")+ String.format("%5d", 5000));
		System.out.println(String.format("%-15s", "Trousers")+ String.format("%5d", 50));
		System.out.println(String.format("%15s", "Total: ")+ String.format("%5d", 7050));
		
		String email1="alice@itv.com";
		String email2="ben@itv.com";
		String email3="chris@ivt.com";
		
		System.out.println("Alice" + email1.endsWith("@itv.com"));
		System.out.println("Ben" + email2.endsWith("@itv.com"));
		System.out.println("Chris" + email3.endsWith("@itv.com"));
		System.out.println("----");
		System.out.println("Alice" + email1.startsWith("a"));
		/*
		0	1   2 	3	4  	5	6	7	8	9	10
		v 	i	r	a	t		k	o	h	l	i
		*/
		String name="virat kohli";
		System.out.println(name.charAt(3));  //input - index    output - char
		System.out.println("First i : " +name.indexOf('i'));  //input - char    output - index
		System.out.println("First i : " +name.lastIndexOf('i')); 
	}

}
