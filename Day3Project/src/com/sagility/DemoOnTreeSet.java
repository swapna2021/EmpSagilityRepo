package com.sagility;

import java.util.Iterator;
import java.util.TreeSet;

public class DemoOnTreeSet {

	public static void main(String[] args) {
		
//		TreeSet<Integer> ts=new TreeSet<Integer>();
//		ts.add(56);
//		ts.add(23);
//		ts.add(67);
//		ts.add(9);
//		
//		for(Integer i:ts)
//			System.out.println(i);
//		System.out.println("***************");
//		Iterator<Integer> itr=ts.descendingIterator();
//		while(itr.hasNext())
//			System.out.println(itr.next());
		
		
		TreeSet<Employee> empTree=new TreeSet<Employee>();
		Employee emp1=new Employee("swapna",123,50000,"Hyd");
		Employee emp2=new Employee("swetha",122,50000,"Hyd");
		Employee emp3=new Employee("Krithi",124,50000,"Hyd");
		Employee emp4=new Employee("Amit",122,50000,"Hyd");
		empTree.add(emp1);
		empTree.add(emp2);empTree.add(emp3);empTree.add(emp4);
		
		for(Employee e:empTree)
			System.out.println(e);	

	}

}
