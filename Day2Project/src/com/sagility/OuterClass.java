package com.sagility;

public class OuterClass {
	
	//non static property,method,innerclass always requires an instance of outer class
	//static property,method,innerclass do not require instance of outer class
	
	private static String outerName;
	
	static String city;
	
	public void acceptouterName() {
		outerName="Amit";
	}
	
	public static void printName() {//static methods goes with static properties only
		System.out.println("outer class name:"+outerName);
	}
	
	//non static inner class
	static class InnerClass{
		
		private String innerName;
		
		public void display() {
			System.out.println("inner display");
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		OuterClass oc=new OuterClass();
		oc.acceptouterName();
		oc.printName();//amit
		
		OuterClass.InnerClass ic=new InnerClass();
		ic.display();
		city="Hyderabad";//city is static
		
		printName();
		
	}

}
