package com.sagility;

import java.util.Date;

public class Customer extends User {
	
	Date orderDate;

	@Override
	public void printDetails() {
		
		System.out.println("Name:"+name+"\nId:"+id+"\nOrderDate:"+orderDate);
		
		
	}

	@Override
	public void acceptDetails() {
		name="swapna";
		id=123;
		orderDate=new Date("17/06/24");
		
	}
	
	

}
