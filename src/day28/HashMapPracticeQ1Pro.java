package day28;

import java.util.HashMap;
import java.util.Map;

public class HashMapPracticeQ1Pro {

	public static void main(String[] args) {
		int arr[]= {10,12,14,16,14};
		//3 Even
		//2 Odd
		
		
		Map<String,Integer> counter=new HashMap();
		
		for(int n:arr)
		{
			if(n%2==0)
			{
				if(counter.containsKey("evencount"))
				{
				counter.put("evencount",counter.get("evencount")+1);
				}
				else
				{
				counter.put("evencount",1);
				}
			}
			else
			{
				if(counter.containsKey("oddcount"))
				{
					counter.put("oddcount", counter.get("oddcount")+1);
				}
				else
				{
					counter.put("oddcount", 1);
				}	
			}
		}
		System.out.println(counter);

	}

}
