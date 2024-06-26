package com.sagility;

import java.util.TreeMap;

public class DemoOnTreeMap {

	public static void main(String[] args) {
		TreeMap<Integer, Employee> tm=new TreeMap<Integer, Employee>();
		
		Employee emp1=new Employee("swapna",123,50000,"Hyd");
		Employee emp2=new Employee("swetha",122,70000,"Hyd");
		Employee emp3=new Employee("Krithi",124,80000,"Hyd");
		Employee emp4=new Employee("Amit",122,30000,"Hyd");
		
		tm.put(12, emp1);
		tm.put(11, emp2);
		tm.put(16, emp3);
		tm.put(13, emp4);
		tm.put(34, emp4);
		
		for(Integer i:tm.keySet())
			System.out.println(i+":  "+tm.get(i));
		

	}

}