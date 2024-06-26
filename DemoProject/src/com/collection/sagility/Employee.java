package com.collection.sagility;

public class Employee  {

		private String empName;
		private int empId;
		private double empSal;
		private String cityName;
		
		
		public Employee() {
			super();
		}

		public Employee(String empName, int empId, double empSal, String cityName) {
			super();
			this.empName = empName;
			this.empId = empId;
			this.empSal = empSal;
			this.cityName = cityName;
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
		
		public String getCityName() {
			return cityName;
		}

		public void setCityName(String cityName) {
			this.cityName = cityName;
		}

		@Override
		public String toString() {
			return "Employee [empName=" + empName + ", empId=" + empId + ", empSal=" + empSal + ", cityName=" + cityName
					+ "]";
		}


//		@Override
//		public int compareTo(Employee o) {
//			return (int)(this.getEmpSal()-o.getEmpSal());
//		}


//		@Override
//		public int compareTo(Employee o) {
//			return this.getEmpName().compareTo(o.getEmpName());
//		}
		
		
		
		

	}

