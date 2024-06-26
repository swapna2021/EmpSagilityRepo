package com.sagility;

import java.util.Scanner;

public class Calculator {
	
	
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public double add(double d1,double d2) {
		return d1+d2;
	}
	
	
	public void add(int a,int b ,int c) {
		System.out.println(a+b+c);
	}
	
	public void add(int i,double d) {
		System.out.println(i+d);
	}
	
	public void add(double d,int i) {
		System.out.println(d+i);
	}
	
	public void add(String s1,String s2) {
		System.out.println(s1+s2);
	}
	
	public void add(Complex c1,Complex c2) {
		
		Complex c=new Complex();
		c.real=c1.real+c2.real;
		c.imag=c1.imag+c2.imag;
		System.out.println(c.real+"+i"+c.imag);
		
	}

	public static void main(String[] args) {
		
		
		Calculator cal=new Calculator();
		cal.add(7,8);
		System.out.println(cal.add(4.5, 5.6));
		Complex c1=new Complex(6,7);
		Complex c2=new Complex(8,9);
		cal.add(c1, c2);
		
	}

}
