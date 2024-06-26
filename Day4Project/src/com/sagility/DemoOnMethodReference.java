package com.sagility;


 interface SayInterface{
	 public void printName();
 }
public class DemoOnMethodReference {
	
	
	public static void sayHello() {
		System.out.println("Hello");
	}
	
	public void printNum() {
		System.out.println(55);
	}

	public static void main(String[] args) {
		
		//static method reference
		SayInterface si=DemoOnMethodReference::sayHello;
		si.printName();
		
		//non-static method reference,instance reference
		DemoOnMethodReference dor=new DemoOnMethodReference();
		SayInterface s1=dor::printNum;
		s1.printName();
		
		
		//nonstatic,constructor method reference
		SayInterface s2=DemoOnMethodReference::new;
		s2.printName();
				
		
	
		
	}

	

}
