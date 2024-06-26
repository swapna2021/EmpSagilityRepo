package com.sagility.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sagility.entities.Department;
import com.sagility.entities.Employee;
import com.sagility.service.DeptService;

@RestController
public class DeptController {
	
	@Autowired
	DeptService service;
	
	@GetMapping("/dept")
	public List<Department> getAllDepartments(){
		return service.getAllDepartments();
	}
	
	@PostMapping("/dept")
	public ResponseEntity<Department> addDepartment(@RequestBody Department d)
	{
		return service.addDepartment(d);
	}
	
	@GetMapping("/dept/{id}")
	public ResponseEntity<Department> getDepartmentById(@PathVariable("deptId") int deptId){
		return service.getDepartmentById(deptId);
	}
	@PutMapping("/dept/{id}")
	public ResponseEntity<Department> updateDepartment(@PathVariable("deptId") int deptId,@RequestBody Department d){
		return service.updateDepartment(deptId, d);
	}
	
	@DeleteMapping("/dept/{id}")
	public Map<String, Boolean> deleteDepartment(@PathVariable("deptId") int deptId){
		return service.deleteDepartment(deptId);
	}
	
	@GetMapping("/dept/employees/{deptId}")
	public List<Employee> findAllEmployeesByDeptId(@PathVariable("deptId") int deptId){
		return service.findAllEmployeesByDeptId(deptId);
				
	}

}
