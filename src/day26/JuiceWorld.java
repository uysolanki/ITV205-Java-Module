package day26;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class JuiceWorld {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Apple Juices");
		int appleJuice=sc.nextInt();
		System.out.println("Enter Number of Mango Juices");
		int mangoJuice=sc.nextInt();
		System.out.println("Enter Number of SB Juices");
		int sbJuice=sc.nextInt();
		
		int minimumTime=calculateTime(appleJuice,mangoJuice,sbJuice);
		System.out.println("Minimum Time "+minimumTime);
		

	}

	private static int calculateTime(int appleJuice, int mangoJuice, int sbJuice) {
		PriorityQueue<Integer> pqueue=new PriorityQueue<Integer>(Collections.reverseOrder());
		int seconds=0;
		
		pqueue.add(appleJuice);
		pqueue.add(mangoJuice);
		pqueue.add(sbJuice);
		
		
		Iterator itr=pqueue.iterator();
		
		while(!pqueue.isEmpty())
		{
			int j1=0;
			int j2=0;
			
			if(itr.hasNext())
			{
				j1=pqueue.remove();
			}
			
			if(itr.hasNext())
			{
				j2=pqueue.remove();
			}
			
			if(j1>0 && j2==0)
			{
				seconds+=j1;
				break;
			}
			
			if(j1>0 && j2>0)
			{
				seconds++;
				j1--;
				j2--;
			}
			
			if(j1>0)
				pqueue.add(j1);
			if(j2>0)
				pqueue.add(j2);
		}
		
		return seconds;
	}

}
