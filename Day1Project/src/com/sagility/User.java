package com.sagility;

//abstract class do not containg instances
//Usage is to extend
//abstract class can have concrete method
//if a class contains an abstract method then class must be abstract
public abstract class User {
	
	protected String name;
	protected int id;
	
	
	public abstract  void printDetails() ;
	
	public abstract void acceptDetails() ;
	
	public String printName() {
		return name;
	}

}
