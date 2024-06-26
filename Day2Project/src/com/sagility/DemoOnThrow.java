package com.sagility;

public class DemoOnThrow {

	public static void method1() {
		
		method2();
	}
	
	public static void method2() {
		
		int a=5,b=0;
		
		if(b==0)
			throw new ArithmeticException();
		
		
	}
	public static void main(String[] args) throws ArithmeticException {
		
		method1();
		
		System.out.println("after method1");
	}

}
