package com.sagility.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sagility.entities.Employee;
@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer>{
	
	public List<Employee> getByEmpName(String empName);
	public List<Employee> getByEmpSal(double empSal);
	@Query(value = "select * from swapna_emp where emp_sal>?1",nativeQuery = true)
	public List<Employee> employeesMoreThanGivenSalary(@Param("empSal") double empSal);
	
	//select * from swapna_emp where emp_name=?1 and mobile=?2
	@Query(value="select emp from Employee emp where empName=:empName and mobile=:mobile ")
	public Optional<Employee> getEmployeeByEmpNameAndMobile(@Param("empName")String empName,@Param("mobile")String mobile);
	
	public List<Employee> findByMail(String email);
	
	
}
