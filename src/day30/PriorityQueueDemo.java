package day30;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
		pq.add(10);
		pq.add(20);
		pq.add(5);
		pq.add(75);
		pq.add(50);
		
		System.out.println(pq.remove());
		System.out.println(pq);
		
		System.out.println(pq.remove());
		System.out.println(pq);

	}

}
