//package com.sagility;
//
//public class Calculator implements CalculatorInterface,SplCalculatorInterface {
//
//	public static void main(String[] args) {
//		Calculator cal=new Calculator();
//		System.out.println(cal.add(6,7));
//		System.out.println(cal.sub(6,7));
//		System.out.println(cal.mul(6,7));
//		System.out.println(cal.div(16,7));
//		System.out.println(cal.power(5, 6));
//		System.out.println(cal.squareRoot(441));
//		System.out.println(cal.factorial(7));
//		
//		CalculatorInterface ci=new Calculator();
//		ci.add(0, 0);
//		SplCalculatorInterface sci=new Calculator();
//	}
//
//	@Override
//	public int add(int a, int b) {
//		
//		return a+b;
//	}
//
//	@Override
//	public int sub(int a, int b) {
//		
//		return a-b;
//	}
//
//	@Override
//	public int mul(int a, int b) {
//		
//		return a*b;
//	}
//
//	@Override
//	public float div(int a, int b) {
//		
//		return ((float)(a)/b);
//	}
//
//	@Override
//	public double power(int a, int b) {
//		
//		return Math.pow(a, b);
//	}
//
//	@Override
//	public double squareRoot(int a) {
//		
//		return Math.sqrt(a);
//	}
//
//	@Override
//	public int factorial(int a) {
//		
////		int fact=1;
////		for(int i=1;i<=a;i++)
////			fact*=i;
////		
//		
//		if(a==1)
//			return 1;
//		else
//			return factorial(a-1)*a;
//		
////		return fact;
//	}
//
//}