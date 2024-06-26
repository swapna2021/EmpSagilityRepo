package com.sagility;

import java.util.Scanner;

//Prime number
public class Hello {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int i,count=0;
		for(i=2;i<Math.sqrt(num);i++) {
			if(num%i==0) {
				count++;
				break;
			}
		}
		
		if(count==0)
			System.out.println("prime");
		else
		  System.out.println("not prime");
	
		
	}

}
