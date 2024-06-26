package com.collection.sagility;

import java.util.Arrays;
import java.util.Stack;

public class DemoOnStack {
	
	public static void main(String[] args) {
		
		Stack<Integer> st=new Stack<Integer>();
		st.add(78);
		st.add(67);
		st.add(77);
		
		st.push(12);
		st.push(33);
		System.out.println("Stack element");
		for(int i:st)
			System.out.println(i);
		
		System.out.println("Popped element : "+st.pop());//removes topmost element
		
		System.out.println("peek element :"+st.peek());
		
		System.err.println("After peek operation");
		for(int i:st)
			System.out.println(i);
		
		System.out.println(st.isEmpty());

		
		
		
	}

}
