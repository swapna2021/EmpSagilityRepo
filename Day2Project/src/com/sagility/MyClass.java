package com.sagility;

public class MyClass extends FinalClass {
	
	
	private String mobileNum;

	public MyClass(String name, int id, String mobileNum) {
		super(name, id);
		this.mobileNum = mobileNum;
	}

	public MyClass() {
		super();
	}
	
	
	//@Override//final methods can not be overridden
	public void printDetails() {
		
		name="sruthi";
		System.out.println(name+"  "+id+" "+mobileNum);
	}

}
