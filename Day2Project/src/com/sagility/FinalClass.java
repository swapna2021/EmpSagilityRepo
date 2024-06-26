package com.sagility;
//final class can not be extended
public  class FinalClass {
	
	 protected String name="swapna";//instance variable with final
	protected int id;
	public FinalClass() {
		super();
	}
	public FinalClass(String name, int id) {
		super();
		this.name = name;//final properties can't be reassigned
		this.id = id;
	}
	@Override
	public String toString() {
		return "FinalClass [name=" + name + ", id=" + id + "]";
	}
	
	public void printDetails() {
		
		final String classname="java";//local var with final
		System.out.println(name+" "+id);
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	

}
