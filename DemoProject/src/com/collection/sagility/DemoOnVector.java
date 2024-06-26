package com.collection.sagility;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class DemoOnVector {
	
	public static void main(String[] args) {
		
		
		Vector<Integer> v=new Vector<Integer>();
		System.out.println(v.capacity());
		for(int i=1;i<=10;i++)
			v.add(i);
		//System.out.println(v.capacity());
		//v.add(11);
		
		for(int i=1;i<=10;i++)
			v.add(i);
		System.out.println(v.capacity());
		v.add(11);
		System.out.println(v.capacity());
		
		//using enumeration
		System.out.println("Enumeration ");
		Enumeration<Integer> en=v.elements();//concurrent modifications are not possible
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());			
		}
		
		System.out.println("Iterator");
		Iterator<Integer> itr=v.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			itr.remove();
		
		}
		
		System.out.println(v);
			
	}
	

}
