package com.collection.sagility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoOnEmpList {

	public static void main(String[] args) {
		
		Employee emp1=new Employee("Swapna",234,60000,"Hyderabad");
		Employee emp6=new Employee("Swapna",234,40000,"Hyderabad");
		Employee emp2=new Employee("Swathi",232,50000,"Hyderabad");
		Employee emp3=new Employee("Preethi",2314,80000,"Delhi");
		Employee emp4=new Employee("Amit",2342,90000,"Chennai");
		Employee emp5=new Employee("Poorna",24,40000,"Hyderabad");
		
		ArrayList<Employee> empList=new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		empList.add(emp6);
		
		System.out.println(empList);
		
		System.out.println("Enhanced for loop");
		for(Employee e:empList)
			System.out.println(e);
		
		
		//Collections.sort(empList);
		
		empList.sort(new CityComparator()
				.thenComparing(new NameComparator())
				.thenComparing(new SalComparator()));
		System.out.println("After sorting");
		for(Employee e:empList)
			System.out.println(e);
		
		
		
		
		

	}

}
