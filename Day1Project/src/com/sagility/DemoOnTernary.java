package com.sagility;

public class DemoOnTernary {
	
	String name;//instance variables
	static String companyName="Sagility";//class variable,shared 

	public static void main(String[] args) {
		
//		int a=15,b=6,c=8;
//		System.out.println(a>b?a:b);//max of two
		//max of 3
		
//		int d= ( a>b && a>c ) ? a :( b>c ? b :c);
//		System.out.println(d);
		
		//max of 4
		
		//local variable ---> method scope
		int a=5,b=6;//interchange /swap  2 numbers
		a=a+b;
		b=a-b;
		a=a-b;
		
		int c=11;//swap 3 numbers
		a=a+b+c;
		b=a-b-c;
		c=a-b-c;
		a=a-b-c;
		System.out.println("a="+a+" b="+b+" c="+c);
			
		DemoOnTernary dot=new DemoOnTernary();
		dot.name="swapna";
		System.out.println(dot.name);//swapna
		System.out.println(dot.companyName);//sagility
		dot.companyName="abc company";
		dot.name="raj";
		System.out.println(dot.name);//raj
		System.out.println(dot.companyName);//abc company
		
		DemoOnTernary dot1=new DemoOnTernary();
//		dot1.name="swathi";
		System.out.println(dot1.name);
		System.out.println(dot1.companyName);//abc company
		//System.out.println(DemoOnTernary.companyName);
		
		

	}

}
