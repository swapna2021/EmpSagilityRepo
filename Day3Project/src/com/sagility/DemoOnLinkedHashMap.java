package com.sagility;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeSet;

public class DemoOnLinkedHashMap {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, Employee> empMap=new LinkedHashMap<Integer, Employee>();
		Employee emp1=new Employee("swapna",123,50000,"Hyd");
		Employee emp2=new Employee("swetha",122,70000,"Hyd");
		Employee emp3=new Employee("Krithi",124,80000,"Hyd");
		Employee emp4=new Employee("Amit",122,30000,"Hyd");
		
		empMap.put(12, emp1);
		empMap.put(11, emp2);
		empMap.put(16, emp3);
		empMap.put(13, emp4);
		empMap.put(34, emp4);
		
		
		//complete code
		//print employees in the order of their salaries
		//print employees in the reverse order of their salaries
		
		TreeSet<Entry<Integer,Employee>> ts=(TreeSet<Entry<Integer, Employee>>) empMap.entrySet();
		
		//create descending iterator

	}

}
