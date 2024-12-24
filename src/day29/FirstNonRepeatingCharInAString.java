package day29;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharInAString {

	public static void main(String[] args) {
		String inputString="aabzfbcdceedfz";
		Map<Character,Integer> charCount=new HashMap();
		for(char c:inputString.toCharArray())		//c='a'
		{
			if(charCount.containsKey(c))
			{
				charCount.put(c, charCount.get(c)+1);
			}
			else
			{
				charCount.put(c, 1);
			}
		}
		
		System.out.println(charCount);
		int flag=0;
		for(char c:inputString.toCharArray())
		{
			if(charCount.get(c)==1)
			{
				flag=1;
				System.out.println(c);
				break;
			}
		}
		
		if(flag==0)
			System.out.println("No Such char found");

	}

}
