package day28;

import java.util.HashMap;
import java.util.Map;

public class HashMapPracticeQ1 {

	public static void main(String[] args) {
		int arr[]= {10,11,12,13,14};
		//3 Even
		//2 Odd
		
		
		Map<String,Integer> counter=new HashMap();
		counter.put("evencount", 0);
		counter.put("oddcount", 0);
		
		for(int n:arr)
		{
			if(n%2==0)
			{
				counter.put("evencount",counter.get("evencount")+1);
			}
			else
			{
				counter.put("oddcount", counter.get("oddcount")+1);
			}
		}
		
		System.out.println(counter);

	}

}
