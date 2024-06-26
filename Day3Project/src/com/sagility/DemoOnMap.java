package com.sagility;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class DemoOnMap {

	public static void main(String[] args) {
	
		HashMap<Integer, String> nameMap=new HashMap<Integer, String>();
		nameMap.put(23,"swapna");
		nameMap.put(12, "amit");
		nameMap.put(45, "Anitha");
		
		System.out.println(nameMap);
		for(String s:nameMap.values())
			System.out.println(s);
		
		for(Integer i:nameMap.keySet())
			System.out.println(i);
		
		System.out.println(nameMap.get(45));
		nameMap.replace(23, "Preethi");
		System.out.println(nameMap);
		nameMap.put(24,"preethi");
		System.out.println(nameMap);
		nameMap.put(47,"preethi");
		System.out.println(nameMap);
		
		Set<Entry<Integer, String>> set=nameMap.entrySet();
		Iterator<Entry<Integer, String>> itr=set.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		

	}

}
