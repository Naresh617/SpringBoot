package com.naresh;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmsApplication implements ApplicationRunner {
	
	/*
	 * @Autowired private EmployeeRepository employeeData;
	 */

	public static void main(String[] args) {
		SpringApplication.run(EmsApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		/*
		 * Employee e1=new Employee("naresh", "Software Engineer"); Employee e2=new
		 * Employee("suresh", "Software Engineer"); employeeData.save(e1);
		 * employeeData.save(e2);
		 */
	}
	

}
