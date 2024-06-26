package com.sagility;

public class Trainer extends Employee {
	
	String language;

	public Trainer(String empName, int empId, double empSal, String language) {
		super(empName, empId, empSal);
		this.language = language;
	}

	public Trainer() {
		super();
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "Trainer [language=" + language + ", getLanguage()=" + getLanguage() + ", getEmpName()=" + getEmpName()
				+ ", getEmpId()=" + getEmpId() + ", getEmpSal()=" + getEmpSal() + "]";
	}
	
	@Override
	public void display() {
		System.out.println("From Trainer");
	}
	
	
	
	
	
	
	

}
