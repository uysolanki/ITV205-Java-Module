package day25;

import java.util.ArrayList;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  //java 1.0  //Legacy classes
		
		//Vector()   default size Vector capacity=10
		
		Vector<String> v1=new Vector();    //default capacity = 10 ,  Default Increment = double
		System.out.println("Capacity " + v1.capacity());   //10
		System.out.println("Size " + v1.size());           //0
		
		for(int i=1;i<=10;i++)
			v1.add("Apple");
		
		System.out.println("Capacity " + v1.capacity());   //10
		System.out.println("Size " + v1.size());           //10   size>capacity
		
		v1.add("Mango");
		
		System.out.println("Capacity " + v1.capacity());   //20
		System.out.println("Size " + v1.size());           //11
		System.out.println("----------------------------");
		
		Vector<String> v2=new Vector(6); //user defined capacity = 6 ,  Default Increment = double
		
		System.out.println("Capacity " + v2.capacity());   //6
		System.out.println("Size " + v2.size());           //0
		
		for(int i=1;i<=7;i++)
			v2.add("Apple");
		
		System.out.println("Capacity " + v2.capacity());   //12
		System.out.println("Size " + v2.size());           //7
		
		System.out.println("----------------------------");
		
		Vector<String> v3=new Vector(15,3); //user defined capacity = 6 ,  user defined Increment = 3
		System.out.println("Capacity " + v3.capacity());   //15
		System.out.println("Size " + v3.size());  			//0
		
		for(int i=1;i<=16;i++)
			v3.add("Apple");
		
		System.out.println("Capacity " + v3.capacity());   //18
		System.out.println("Size " + v3.size());  	       //16
		
		System.out.println("----------------------------");
		ArrayList a1=new ArrayList();
		Vector v4=new Vector(a1);
		
		

	}

}
