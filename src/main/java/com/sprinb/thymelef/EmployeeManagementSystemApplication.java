package com.sprinb.thymelef;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sprinb.thymelef.repository.EmployeeRepository;

@SpringBootApplication
@ComponentScan(basePackages  = "com.sprinb.thymelef.repository")
@EnableJpaRepositories(basePackages = "com.sprinb.thymelef.repository")
@EntityScan("com.sprinb.thymelef.entity")
public class EmployeeManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
		/*
		Employee emp1 =  new Employee("Sai", "Manyam", 25000.05, "sai@yahoo.com", 24); 
		Employee emp2 = new Employee("Arun", "Nunna", 35650.06, "arun05@gmail.com", 26);
		Employee emp3 = new Employee("Aayansh", "Sri", 75520.05, "aayanshsri@yahoo.com", 22);
		Employee emp4 = new Employee("pallavi", "priya", 45230.05, "pallavip@gmail.com", 23);
		employeeRepository.save(emp1);
		employeeRepository.save(emp2);
		employeeRepository.save(emp3);
		employeeRepository.save(emp4);
		*/
		
	}

} 
