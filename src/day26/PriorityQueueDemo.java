package day26;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue(Collections.reverseOrder()); 
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(25);
		pq.add(15);
		
		System.out.println(pq);
		//System.out.println("SIZE " +pq.size());  //5
		System.out.println(pq.remove());		 //30
		//System.out.println("SIZE " +pq.size());  //4
		System.out.println(pq.isEmpty());
		
		System.out.println(pq.remove());	
		System.out.println(pq.remove());	
		System.out.println(pq.remove());	
		System.out.println(pq.remove());
		System.out.println(pq.isEmpty());
	}

}
