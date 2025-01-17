package com.sagility;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DemoOnLambda {

	public static void main(String[] args) {
		
		ArrayList<Integer> alist=new ArrayList<Integer>();
		alist.add(67);
		alist.add(62);
		alist.add(25);
		alist.add(23);
		alist.add(88);
		alist.add(42);
		System.out.println(alist);
		
		Consumer c=(num)->System.out.println(num);
		c.accept(56);
		
		alist.forEach(i->System.out.println(i));
		
		
		Predicate<Integer> p=(num)->{
			if(num%2==0)
				return true;
			else 
				return false;
		};
		for(int i:alist) {
			System.out.println(p.test(alist.get(i)));
			
		}
		
		
		Supplier<String> s=()-> "swapna" ;
		System.out.println(s.get());
		
		
		Function<Integer, Integer> f=(n)->n*n;
		System.out.println(f.apply(5));
		
	}

}
