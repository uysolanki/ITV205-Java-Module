package day24;

import java.util.ArrayList;
import java.util.List;

public class ColectionInterfaceMethodsCont {

	public static void main(String[] args) {
//		List<String> l1=new ArrayList();  //Ref is of List object is of ArrayList
//		System.out.println(l1.add("Alice"));		//index 0
//		l1.add("Ben");			//index 1
//		l1.add("Cruise");		//index 2
//		
//		System.out.println(l1);
//		
//		l1.add(2,"Tom");
//		
//		System.out.println(l1);
//		
//		l1.remove("Ben");
//		System.out.println(l1);
//		
//		l1.remove(1);  //index
//		System.out.println(l1);  //[Alice,Cruise]
//		
//		System.out.println(l1.remove("Ben"));
//		
//		
//		
//		String name=l1.get(0);
		
		
		List<String> mh=new ArrayList();
		mh.add("Pune");
		mh.add("Mumbai");
		mh.add("Nagpur");
		
		List<String> rj=new ArrayList();
		rj.add("Jaipur");
		rj.add("Bikaner");
		rj.add("Fatehpur");

		List<String> India=new ArrayList();
		India.addAll(mh);
		India.addAll(rj);
		
		System.out.println(India.get(4));
//		India.add("Kolkata");
//		India.add("Chennai");
//		System.out.println(India.size());
//		
//		System.out.println(India);
//		System.out.println(India.isEmpty());
//		
//		India.clear();
//		System.out.println(India.isEmpty());
		
//		India.removeAll(rj);
//		System.out.println(India);
//		

//		India.retainAll(mh);
//		System.out.println(India);
		
//		String name="Alice";
//		name.length();
//		
//		String arr[]= {"Alice","Ben","Chris"};
//		arr.length
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
