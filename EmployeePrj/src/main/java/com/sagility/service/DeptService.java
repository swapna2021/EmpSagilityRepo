package com.sagility.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sagility.entities.Department;
import com.sagility.entities.Employee;
import com.sagility.repository.DeptRepository;

@Service
public class DeptService implements DeptServiceInterface {

	
	@Autowired
	DeptRepository repository;
	
	@Override
	public List<Department> getAllDepartments() {
		
		return repository.findAll();
	}

	@Override
	public ResponseEntity<Department> addDepartment(Department d) {
		Department dept=repository.save(d);
		return ResponseEntity.ok().body(dept);
	}

	@Override
	public ResponseEntity<Department> getDepartmentById(int id) {
		Department dept=repository.findById(id).get();
		return ResponseEntity.ok().body(dept);
	}

	@Override
	public ResponseEntity<Department> updateDepartment(int id, Department d) {
		
		Department dept=repository.findById(id).get();
		dept.setDeptName(d.getDeptName());
		dept.setCity(d.getCity());
		repository.save(dept);
		return ResponseEntity.ok().body(dept);
	}

	@Override
	public Map<String, Boolean> deleteDepartment(int id) {
		Department dept=repository.findById(id).get();
		repository.delete(dept);
		Map<String ,Boolean> response=new HashMap<String,Boolean>();
		response.put("Department deleted",Boolean.TRUE);
		return response;
	}
	
	@Override
	public List<Employee> findAllEmployeesByDeptId(int deptId) {
		
		return repository.findAllEmployeesByDeptId(deptId);
	}

}
