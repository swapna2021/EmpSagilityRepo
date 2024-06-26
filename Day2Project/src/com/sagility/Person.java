package com.sagility;

import java.io.Serializable;

public class Person implements Serializable {
	
	private String name;
	private String mobileNum;
	private int age;
	public Person() {
		super();
	}
	public Person(String name, String mobileNum, int age) {
		super();
		this.name = name;
		this.mobileNum = mobileNum;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", mobileNum=" + mobileNum + ", age=" + age + "]";
	}
	

}
