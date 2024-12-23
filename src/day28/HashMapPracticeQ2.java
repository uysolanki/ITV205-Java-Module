package day28;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashMapPracticeQ2 {

	public static void main(String[] args) {
		String inputString="one two one two three four one three five five";
		 // one -> 3,  two -> 2, three-> 2, four-> 1, five -> 2
		
		Map<String,Integer> map=new HashMap<String, Integer>();
		
		  String words[]=inputString.split(" ");
		  System.out.println(Arrays.toString(words));
		  
		  for(String word:words) {
			  if(map.containsKey(word)) {
				  map.put(word, map.get(word)+1);
			  }
			  else {
				  map.put(word, 1);
			  }
		  }
		  System.out.println(map);

	}

}
