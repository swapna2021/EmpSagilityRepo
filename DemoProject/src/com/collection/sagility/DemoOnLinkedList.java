package com.collection.sagility;

import java.util.LinkedList;

//The underlying datastructure is Doubly
public class DemoOnLinkedList {

	public static void main(String[] args) {
	
		LinkedList<String> fruitList=new LinkedList<String>();
		fruitList.add("mango");
		fruitList.add("banana");
		fruitList.add("apple");
		System.out.println(fruitList);//follows insertion order
		fruitList.add("mango");//duplicates allowed
		System.out.println(fruitList);
		
		fruitList.addFirst("Watermelon");
		System.out.println(fruitList);
		
		
		
		

	}

}
