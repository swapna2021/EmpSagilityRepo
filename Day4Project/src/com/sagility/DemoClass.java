package com.sagility;

//an interface having atmost one abstract method is known as funtional interface

@FunctionalInterface
interface MyInterface{
	public void sayHello();//abstract
	
	public default void print() {
		System.out.println(5);
	}
}


public class DemoClass  {

	public static void main(String[] args) {
		
//		DemoClass dc=new DemoClass();
//		dc.sayHello();
//		
//		MyInterface mi=new DemoClass();
//		mi.sayHello();
		
		//lambda is a anonymous functional expression
		MyInterface m1=()-> System.out.println("hello");//no return no parameters	
		m1.sayHello();
		
		
//		CalculatorInterface ci=(a,b)-> a+b;//with return and parameters
//		System.out.println(ci.add(5,6));
		
		
//		CalculatorInterface ci=(a,b)->System.out.println(a-b);//no return with parameters
//		ci.sub(7, 4);
		
		CalculatorInterface ci=()->{
			
			int a=5,b=6;
			return a*b;
			
		};
		
		System.out.println(ci.mul());//no parameters but with return
		
		
		
		
		
	}

	

	
	

}
