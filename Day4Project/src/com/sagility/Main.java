package com.sagility;

public class Main {

	public static void main(String[] args) {
	
//		Class1 c1=new Class1();
//		c1.sayHello();//Hellooo
//		Class2 c2=new Class2();
//		c2.sayHello();//heloo swapna
//		
//		Interface1 i1=new Class1();
//		i1.sayHello();//binding class1 sayHello at runtime
//		i1=new Class2();
//		i1.sayHello();//binding class2 sayHello at runtime
		
		Class3 c3=new Class3();
		c3.sayHello();
		Interface1 i1=new Class3();
		i1.sayHello();
		Interface2 i2=new Class3();
		i2.sayHello();
		c3.printNums(10);
		System.out.println("***************");
		Class2 c2=new Class2();
		c2.printNums(6);
		
		Interface1.sumOnN(0);
		c2.printNums(5);

	}

}
