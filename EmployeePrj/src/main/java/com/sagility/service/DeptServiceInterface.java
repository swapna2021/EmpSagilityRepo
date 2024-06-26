package com.sagility.service;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.sagility.entities.Department;
import com.sagility.entities.Employee;

public interface DeptServiceInterface {
	
	public List<Department> getAllDepartments();
	public ResponseEntity<Department> addDepartment(Department d);
	public ResponseEntity<Department> getDepartmentById(int id);
	public ResponseEntity<Department> updateDepartment(int id,Department d);
	public Map<String, Boolean> deleteDepartment(int id);
	public List<Employee> findAllEmployeesByDeptId(int deptId);

}
