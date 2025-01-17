package com.sagility.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sagility.entities.Employee;
import com.sagility.exception.NoSuchIdPresentException;
import com.sagility.service.EmpService;

@RestController
//@Controller + @ResponseBody
public class EmpController {
	
	@Autowired
	EmpService service;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){	
		return service.getAllEmployees();
		
	}
	
	@PostMapping("/employees")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		return service.saveEmployee(employee);
	}
	
	
	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") int id)  {
		return service.getEmployeeById(id);
	}
	
	
	@PutMapping("/employees/{id}")
	public Employee updateEmployee(@PathVariable("id") int id,@RequestBody Employee updateEmp) {
		return service.updateEmployee(id,updateEmp);
	}
	
	@DeleteMapping("/employees/{id}")
	public Map<String,Boolean> deleteEmployee(@PathVariable int id)  {
		return service.deleteEmployee(id);
	}
	
	
	@GetMapping("/employees/name/{empName}")
	public List<Employee> getEmployeesByEmpName(@PathVariable("empName") String empName){
		
		return service.getEmployeeByEmpName(empName);
	}
	

	@GetMapping("/employees/sal/{empSal}")
	public List<Employee> getEmployeesByEmpSal(@PathVariable("empSal") double empSal){
		
		return service.getByEmpSal(empSal);
	}
	
	@GetMapping("/employees/bonus/{empSal}")
	public List<Employee> calculateBonus(@PathVariable("empSal") double empSal){
		return service.calculateBonus(empSal);
	}
	
	@GetMapping("/employees/name/mobile/{empName}/{mobile}")
	public Employee getEmployeeByNameAndMobile(@PathVariable("empName")String empName,
			@PathVariable("mobile")String mobile) {
		return service.getEmployeeByNameAndMobile(empName,mobile);
	}
	
	@GetMapping("/employees/email/{email}")
	public List<Employee> findByMail(@PathVariable("email") String email) {
		return service.findByMail(email);
	}
	
	
	
}
