package com.naresh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.naresh.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	@Query(value="SELECT * FROM EMPLOYEE WHERE DEPT='HOME'",nativeQuery = true)
	List<Employee> getDeptDetails();
}
