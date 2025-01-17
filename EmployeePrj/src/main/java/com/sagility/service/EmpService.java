package com.sagility.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.sagility.entities.Employee;
import com.sagility.exception.NoSuchIdPresentException;
import com.sagility.repository.EmpRepository;

@Service
public class EmpService implements EmpServiceInterface{

	@Autowired
	EmpRepository repository;
	
	@Override
	public List<Employee> getAllEmployees() {
		return repository.findAll();
	}
	@Override
	public ResponseEntity<Employee> saveEmployee(Employee employee) {
		
		Employee e=repository.save(employee);
		return ResponseEntity.ok().body(e);
	}
	@Override
	public ResponseEntity<Employee> getEmployeeById(int id)  {
		Employee e= repository.findById(id).get();		
		return ResponseEntity.ok().body(e);
				
	}
	@Override
	public Employee updateEmployee(int id, Employee updateEmp) {
		
		Employee curEmp=repository.findById(id).get();
		if(curEmp!=null)
		{
			curEmp.setEmpName(updateEmp.getEmpName());
			curEmp.setEmpSal(updateEmp.getEmpSal());
			curEmp.setMobile(updateEmp.getMobile());
			curEmp.setEmail(updateEmp.getEmail());
			return repository.save(curEmp);
		}
		return null;
	}
	@Override
	public Map<String,Boolean> deleteEmployee(int id)  {
		
		Employee emp=repository.findById(id).get();
				
		repository.delete(emp);
		Map<String ,Boolean> response=new HashMap<String,Boolean>();
		response.put("Employee deleted",Boolean.TRUE);
		return response;
	}
	@Override
	public List<Employee> getEmployeeByEmpName(String empName) {
		
		return repository.getByEmpName(empName);
	}

	@Override
	public List<Employee> getByEmpSal(double empSal) {
		
		return repository.getByEmpSal(empSal);
	}
	@Override
	public List<Employee> calculateBonus(double empSal) {
		
		List<Employee> empList=repository.employeesMoreThanGivenSalary(empSal);
		for(Employee e:empList)
		{
			e.setEmpSal(e.getEmpSal()+5000);
		}
		return empList;
	}
	public Employee getEmployeeByNameAndMobile(String empName, String mobile) {
	
		return repository.getEmployeeByEmpNameAndMobile(empName, mobile).get();
	}
	@Override
	public List<Employee> findByMail(String email) {
		
		return repository.findByMail(email);
	}
	

}
