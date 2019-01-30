package JavaPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollectionsArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a =new ArrayList<String>();
		a.add("Sandy");
		a.add("Kes");
		a.add(0, "Mom");
		System.out.println(a);
		System.out.println(a.remove(0));
		System.out.println(a.contains("Kes"));
		System.out.println(a.get(0));
		System.out.println(a.indexOf("Kes"));	
		System.out.println(a.size());

		System.out.println(a.isEmpty());
		HashSet<String> hs=new HashSet<String>();
		hs.add("Apple");
		hs.add("orange");
		hs.add("king");
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.remove("orange"));
		System.out.println(hs.isEmpty());
		
		Iterator<String> i=hs.iterator();
	i.next();
	
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		
		}
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(0, "Sandy");
		hm.put(1,"Kes");
		hm.put(2,"This");
		Set sn=hm.entrySet();
		
		Iterator it=sn.iterator();
		
		
		while(it.hasNext())
		{
		Map.Entry mp=(Map.Entry)it.next();
		
		System.out.println(mp.getKey());
		System.out.println(mp.getValue());

		}
		
		
 
	}

}
