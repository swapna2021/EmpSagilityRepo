package com.sagility;

public class Class3  implements Interface1,Interface2{

	@Override
	public void sayHello() {
		System.out.println("From class3");
		
	}
	@Override
	public void printName() {
		System.out.println(name);
		
	}
}
