package com.sagility;

public class Main {

	public static void main(String[] args) {
		
		Employee emp=new Employee("swapna",123,50000);
		System.out.println(emp);
		
		Trainer tra=new Trainer("swathi", 124, 80000, "Java");
		System.out.println(tra);
		
		Manager man=new Manager("Amit", 125, 90000, "Accounts");
		System.out.println(man);
		
		
		emp.display();//parent class display
		
		Employee emp1=new Trainer("Raj", 126, 70000, "Python");
		System.out.println(emp1);
		
		emp1.display();//trainer class
		
		emp1=new Manager("Vikky", 128, 60000, "sales");
		System.out.println(emp1);
		
		emp1.display();
	}

}
