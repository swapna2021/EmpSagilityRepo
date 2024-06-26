package com.sagility;

public class ClassA {
	
	String name;
	
	public ClassA() {
		System.out.println("from A");
	}
	
	
	

}

class ClassB extends ClassA{
	
	public ClassB() {
		System.out.println("From B");
	}
	
}
