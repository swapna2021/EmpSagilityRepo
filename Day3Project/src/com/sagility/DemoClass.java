package com.sagility;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoClass {

	public static void main(String[] args) {
		
//		Object obj=new Object();
//		System.out.println(obj.hashCode());
		//hashset initial capacity is 16
		//set will not follow insertion order
		Set set=new HashSet();
		
		set.add("Swapna");
		set.add(56);
		set.add(true);
		
		Iterator itr=set.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		HashSet<Integer> hset=new HashSet<Integer>();
		hset.add(67);
		hset.add(89);
		hset.add(45);
		hset.add(67);
		hset.add(67);
		
		for(Integer i:hset)
			System.out.println(i);//set do not allow duplicates
		
		
		hset.add(null);// only one null element allowed
		
		for(Integer i:hset)
			System.out.println(i);
		
		HashSet<Integer> h1=(HashSet<Integer>) hset.clone();
		
		for(Integer i:h1)
			System.out.println(i);
		
		hset.add(56);
		System.out.println("hset values");
		for(Integer i:hset)
			System.out.println(i);
		
		System.out.println("h1 values");
		for(Integer i:h1)
			System.out.println(i.hashCode());
		
	
		
	}

}
