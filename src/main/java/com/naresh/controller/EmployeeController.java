package com.naresh.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.naresh.model.Employee;
import com.naresh.repository.EmployeeRepository;

@RestController
@CrossOrigin
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeData;
	
	@GetMapping("/allEmployees")
	public List<Employee> getAllEmployees()
	{
		return employeeData.findAll();
	}
	
	@GetMapping(value="/allEmployees/V1",produces=MediaType.APPLICATION_XML_VALUE)
	@ResponseBody
	public List<Employee> getAllEmployessXml(){
		return employeeData.findAll();
	}
	
	@GetMapping(value="/getEmployeId/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Optional<Employee> getEmployeeById(@PathVariable long id )
	{
		Optional<Employee> emp= employeeData.findById(id);
		if(emp.isPresent())
		{
			return emp;
		}else {
			return Optional.empty();
		}
	}
	
	@PostMapping("/employeesave")
	public Employee newEmployeeAdd(@RequestBody Employee emp) {
		return employeeData.save(emp);
		
	}
	
	@GetMapping(value="/dept",produces=MediaType.APPLICATION_XML_VALUE)
	public List<Employee> getDeptDetails() {
		return employeeData.getDeptDetails();
	}
	
	
	
	
	
	

}
