package com.sagility;

public class Student  extends User{
	
//	public String name;
//	private int id;	
	String collegeName;
	
	
	public Student() {
		super();
	}
//	
//	public Student(String name, int id) {
//		super();
//		this.name = name;
//		this.id = id;
//		this.collegeName="abc";
//	}
	
	public Student(String name, int id, String collegeName) {//constructor overloading
		super();
		this.name = name;
		this.id = id;
		this.collegeName = collegeName;
	}




//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

//	public static void main(String[] args) {
//		
//		Student st=new Student();//default constructor
//		
//		Student st1=new Student("swapna",123,"abc");
//		Student st2=new Student("amit",124,"abc");
//		Student st3=new Student("poorna",121,"abc");
//		
//
//	}

	@Override
	public void printDetails() {
		
		System.out.println("Name:"+name+"\nId:"+id+"\ncollegename:"+collegeName);
		
		
	}

	@Override
	public void acceptDetails() {
		// TODO Auto-generated method stub
		
	}

}
