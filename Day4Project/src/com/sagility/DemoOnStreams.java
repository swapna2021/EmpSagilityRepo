package com.sagility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DemoOnStreams {

	public static void main(String[] args) {
		ArrayList<Integer> alist=new ArrayList<Integer>();
		alist.add(67);
		alist.add(62);
		alist.add(25);
		alist.add(23);
		alist.add(88);
		alist.add(42);
		alist.add(67);
		alist.add(62);
		alist.add(25);
		alist.add(23);
		alist.add(88);
		alist.add(42);
		alist.add(67);
		alist.add(62);
		alist.add(25);
		alist.add(23);
		alist.add(88);
		alist.add(42);
		
		
		
//		int total=alist.stream()
//		.filter(n->n%2==0)
//		.reduce(0,((sum,n)->sum+n));
//		System.out.println(total);
//		
//		
//		
//		Optional<Integer> o=alist.stream()
//		.limit(10)
//		.filter((num)->num%2==0)
//		.map(n->n*n)
//		.max((n1,n2)->n1-n2);
//		System.out.println("max element" +o.get());
//		
//		//create collection of strings ,find all the strings starting with s
//		
//		String s[]= {"swapna","amit","swathi","Raj","vikky"};
//		
//		String s1=Arrays.asList(s).stream()
//		.filter(n->n.charAt(0)=='s')
//		.reduce("",((finalStr,s2)->finalStr+s2));
//		System.out.println(s1);
//		
		alist.stream()
		.distinct()
		.forEach(n->System.out.println(n));
		
		

	}

}
