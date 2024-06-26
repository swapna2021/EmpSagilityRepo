package com.sagility;

import java.util.Scanner;

public class DemoOnLoops {
	
	public static void main(String[] args) {
		
		String name;
		char choice='n';
		Scanner sc=new Scanner(System.in);
//		while(choice=='y')//entry control loop
//		{
//			System.out.println("enter name");
//			name=sc.next();
//			System.out.println(name);
//			System.out.println("enter choice y/n");
//			choice=sc.next().charAt(0);
//		}
		
//		do {
//			System.out.println("enter name");
//			name=sc.next();
//			System.out.println(name);
//			System.out.println("enter choice y/n");
//			choice=sc.next().charAt(0);
//		}while(choice=='y');
		
		
		for(int i=1;i<=10;i++){
			System.out.println(i);
		}
		
		
	}

}
