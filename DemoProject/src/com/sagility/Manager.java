package com.sagility;

public class Manager extends Employee{
	
	private String branchName;

	public Manager(String empName, int empId, double empSal, String branchName) {
		super(empName, empId, empSal);
		this.branchName = branchName;
	}

	public Manager() {
		super();
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	@Override
	public String toString() {
		return "Manager [branchName=" + branchName + ", getEmpName()=" + getEmpName() + ", getEmpId()=" + getEmpId()
				+ ", getEmpSal()=" + getEmpSal() + "]";
	}
	
	@Override
	public void display() {
		System.out.println("From Manager");
	}
	
	
	

}
