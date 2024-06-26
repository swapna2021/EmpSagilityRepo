package com.collection.sagility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoOnArrayList {

	public static void main(String[] args) {
		
		ArrayList alist=new ArrayList();
		alist.add("Swapna");//string
		alist.add(56);//Integer
		alist.add(89.9);//Double
		alist.add(true);//Boolean
		//List follows insertion order
//		System.out.println("ArrayList objects");
//		for(int i=0;i<alist.size();i++)
//			System.out.println(alist.get(i));
//		
		
		alist.add(89.9);//duplicates are allowed
		alist.add(3,76);//inserting at a given index
		
		for(int i=0;i<alist.size();i++)
			System.out.println(alist.get(i));
		
		alist.remove(3);
		System.out.println("*******************");
		for(int i=0;i<alist.size();i++)
			System.out.println(alist.get(i));
		
		int arr[]= {12,2,3,4};
		List list=Arrays.asList(arr);
		
	
	}

}
