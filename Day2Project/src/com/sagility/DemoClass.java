package com.sagility;

public class DemoClass {
	
	
	public static void main(String[] args) {
		
		
		String name="Amit";//strings ar immutable
		
		System.out.println(name.hashCode());
		name="swapna";
		
		System.out.println(name.hashCode());
		
		String n="swapna";
		System.out.println(n.hashCode());
		System.out.println(n.length());
		
		n="    Hello   ";
		System.out.println(n.length());
		System.out.println(n.trim().length());
		
		StringBuffer sbf=new StringBuffer("swapna");
		System.out.println(sbf.hashCode());
		sbf.append("amit");
		System.out.println(sbf.hashCode());
		
		
	}
		
		
	

}
