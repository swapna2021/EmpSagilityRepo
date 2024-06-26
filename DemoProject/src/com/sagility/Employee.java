package com.sagility;

public class Employee implements Comparable<Employee> {
	
	private String empName;
	private int empId;
	private double empSal;
	
	
	public Employee() {//default constructor
		super();
	}


	public Employee(String empName, int empId, double empSal) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empSal = empSal;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public double getEmpSal() {
		return empSal;
	}


	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}


	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", empSal=" + empSal + "]";
	}
	
	
	public void display() {
		System.out.println("From employee");
	}


	@Override
	public int compareTo(Employee o) {
		
		return this.getEmpName().compareTo(o.getEmpName());
	}
	

}
