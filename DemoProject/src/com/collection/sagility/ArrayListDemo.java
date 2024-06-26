package com.collection.sagility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> alist=new ArrayList<Integer>();
		alist.add(89);
		alist.add(67);
		alist.add(77);
		alist.add(67);
		alist.add(89);
		alist.add(67);
		alist.add(89);
		alist.add(67);
		
		
		System.out.println("ArrayList elements");
		for(int i=0;i<alist.size();i++)//i is index in the arraylist
			System.out.println(alist.get(i));
		
		System.out.println("Enhanced loop");
		for(int i:alist)//i is an element of arraylist
			System.out.println(i);
		
		System.out.println(alist);
		//using consumer functional interface inside forEach
		System.out.println("using foreach");
		alist.forEach(i->System.out.println(i));
		
		System.out.println("Using iterator");
		
		Iterator<Integer> itr=alist.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.add(66);
		al1.add(34);
		alist.addAll(al1);
		
		System.out.println(alist);
		
		if(alist.contains(66))//search operation
			System.out.println("element found");
		
	
		System.out.println("Index of 67 is "+alist.indexOf(67));
		System.out.println("Last Index of 67 is "+alist.lastIndexOf(67));
	
		System.out.println("sorted list");
		Collections.sort(alist);//Collections is a utility class
		System.out.println(alist);
	

	}

}
