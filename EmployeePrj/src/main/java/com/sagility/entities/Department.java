package com.sagility.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Department {
	
	@Id
	private int deptId;
	private String deptName;
	private String city;
	@OneToMany(mappedBy = "dept")
	@JsonIgnore
	private List<Employee> empList;
	

}
