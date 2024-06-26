package com.sagility;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomerStream {

	public static void main(String[] args) {
		
		ArrayList<Customer> clist=new ArrayList<Customer>();
		Customer c1=new Customer("swapna",123,"hyderabad");
		Customer c2=new Customer("swathi",124,"Chennai");
		Customer c3=new Customer("Preethi",223,"Delhi");
		Customer c4=new Customer("Mona",13,"hyderabad");
		Customer c5=new Customer("Priya",113,"hyderabad");
		Customer c7=new Customer("swathi",124,"Chennai");
		Customer c8=new Customer("Preethi",223,"Delhi");
		Customer c9=new Customer("sona",13,"hyderabad");
		Customer c10=new Customer("sriya",113,"hyderabad");
		Customer c11=new Customer("swathi",124,"Chennai");
		Customer c12=new Customer("Preethi",223,"Delhi");
		Customer c13=new Customer("Monali",13,"hyderabad");
		Customer c14=new Customer("Priyadharshi",113,"hyderabad");
		
		Customer cust[]= {c1,c2,c3,c4,c5,c8,c7,c9,c10,c11,c12,c13,c14};
		Arrays.asList(cust).stream()
		.filter(c->c.getCity().equals("hyderabad"))
		.filter(c->c.getName().startsWith("P")||c.getName().startsWith("M"))
		.map(c->c.getName().toUpperCase())
		.map(c->"SRI "+c)
		.forEach(System.out::println);
		

	}

}
