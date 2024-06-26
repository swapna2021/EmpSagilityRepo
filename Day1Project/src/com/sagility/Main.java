package com.sagility;

public class Main {

	public static void main(String[] args) {
		
		//User user=new User();
		Customer c=new Customer();
		Student s=new Student("Amit",456,"AbcCollege");
		c.acceptDetails();
		c.printDetails();
		s.printDetails();
		System.out.println("Using parent reference");
		User u=c;
		u.printDetails();
		System.out.println(u.printName());
		
		u=s;
	
		u.printDetails();
		System.out.println(u.printName());
	}

}
