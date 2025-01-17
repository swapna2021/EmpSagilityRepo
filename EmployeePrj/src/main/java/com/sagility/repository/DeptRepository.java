package com.sagility.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sagility.entities.Department;
import com.sagility.entities.Employee;
@Repository
public interface DeptRepository extends JpaRepository<Department, Integer> {

	@Query(value="select e from Employee e,Department d  where e.dept.deptId=d.deptId and d.deptId=:deptId")
	public List<Employee> findAllEmployeesByDeptId(@Param("deptId")int deptId);
}
