package com.sagility.service;

import java.util.List;
import java.util.Map;

import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import com.sagility.entities.Employee;
import com.sagility.exception.NoSuchIdPresentException;

public interface EmpServiceInterface {
	
	public List<Employee> getAllEmployees();
	public ResponseEntity<Employee> saveEmployee(Employee employee);
	public ResponseEntity<Employee> getEmployeeById(int id) ;
	public Employee updateEmployee(int id, Employee updateEmp);
	public Map<String,Boolean> deleteEmployee(int id) ;
	public List<Employee> getEmployeeByEmpName(String empName);
	public List<Employee> getByEmpSal(double empSal);
	public List<Employee> calculateBonus(double empSal);
	public List<Employee> findByMail(String email);
	
}
