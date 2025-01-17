package com.sagility.entities;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="SwapnaEmp")
@NamedQuery(name="Employee.findByMail", query = "select e from Employee e where email=:email ")
public class Employee {
	@Size(min=3,message="Minimum of 3 chars expected")
	@Column(name="name")
	private String empName;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	@Min(value = 10000,message="min sal is 10000")
	private double empSal;
	@Pattern(regexp = "[6789][0-9]{9}",message="Invalid phone number")
	private String mobile;
	@Email
	private String email;
	
	@ManyToOne
	@JoinColumn(name="departmentId",referencedColumnName ="deptId" )
	private Department dept;
	

}
