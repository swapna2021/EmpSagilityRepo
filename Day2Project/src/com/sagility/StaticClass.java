package com.sagility;


public  class StaticClass {
	
	private  String name;
	private int age;
	//class variables
	static String companyName="ABCCorp.com";//static properties are shared properties
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public static void display() {
		System.out.println("display method");
	}
	
	public void printName() {
		System.out.println(name);
	}
	
	static class  InnerClass{
		
	}
	
	static {
		
		System.out.println("static block");
	}

}
