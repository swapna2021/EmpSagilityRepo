package com.sagility;

public class DemoOnStaticClass {
	
	
	public static void sayHello() {//non static methods are object methods
		//static methods are class methods
		System.out.println("hello");
	}
	
	//static blocks are executed by JVM
	//static blocks will be executed first
	//static main method
	//static methods called inside main method
//	static {
//		System.out.println("My first static block");
//		
//	}
//	
//	static {
//		System.out.println("block2");
//	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("in the main method");
		
//		StaticClass sc=new StaticClass();
//		sc.setName("swapna");
//		System.out.println(sc.getName());
//		sc.setAge(42);
//		
//		System.out.println(sc.getCompanyName());
//		//sc.setCompanyName("A");
//		sc.setCompanyName("xyz.com");
//		sc.getCompanyName();//xyz.com
//		
//		StaticClass sc1=new StaticClass();
//		System.out.println(sc1.getCompanyName());//xyz
//		
//		DemoOnStaticClass dos=new DemoOnStaticClass();
//		dos.sayHello();
		
		DemoOnStaticClass.sayHello();
		//DemoClass.sayHello();
		
		
	}
	
	
//	static {
//		System.out.println("block3");
//	}

}
