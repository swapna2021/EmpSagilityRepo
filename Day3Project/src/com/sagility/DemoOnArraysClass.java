package com.sagility;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoOnArraysClass {

	public static void main(String[] args) {
		
		int arr[]= {45,34,78,90,12,22,44};
		
//		List l=Arrays.asList(arr);
//		for(int i=0;i<l.size();i++)
//			System.out.println(l.get(i));
		
		
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
		
		int key=78;
		System.out.println(Arrays.binarySearch(arr, key));
		
		
		Integer a[]= new Integer[]{45,34,78,90,12,22,44};
		List l=Arrays.asList(a);
		System.out.println(l);
		
		
		String[] fruits= {"mango","apple","cherry"};
		List l1=Arrays.asList(fruits);
		System.out.println(l1);
		
		Collections.sort(l1);
		System.out.println(l1);
		
		
		
		
	}

}
