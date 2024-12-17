package day24;

import java.util.ArrayList;
import java.util.List;

public class NestedList {

	public static void main(String[] args) {
	
		List<String> mh=new ArrayList();
		mh.add("Pune");
		mh.add("Mumbai");
		mh.add("Nagpur");
		
		List<String> rj=new ArrayList();
		rj.add("Jaipur");
		rj.add("Bikaner");
		rj.add("Fatehpur");
		
		List<String> gj=new ArrayList();
		gj.add("Ahmedabad");
		gj.add("Surat");
		gj.add("Vadodra");
		
		List<List<String>> India=new ArrayList();
		India.add(mh);
		India.add(rj);
		India.add(gj);
		System.out.println(India);
		
		for(int i=0;i<India.size();i++)
		{
			System.out.println(India.get(i).get(0));
		}
		
		//System.out.println(India.get(1).get(1));

	}

}
