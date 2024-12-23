package day27;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String,Double> employees=new HashMap();			//Doesnt preserve the order it also hashing
		employees.put("Alice", 800.0);
		employees.put("Ben", 900.0);
		employees.put("Chris", 1000.0);
		
		System.out.println(employees);

	}

}
