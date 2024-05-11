package com.sprinb.thymelef.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.sprinb.thymelef.entity.Employee;
@DataJpaTest
@AutoConfigureTestDatabase(replace=AutoConfigureTestDatabase.Replace.NONE)
class EmployeeRepositoryTest {

	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private TestEntityManager testEntityManager;
	@BeforeEach
	void setup() {
		Employee employee = new Employee(5l,"abc","oops",25630.0,"abc@gmail.com",23);
		testEntityManager.persist(employee);
	}
	@Test
	public void testFindById() {
		Employee emp = employeeRepository.findById(5l).get();
		assertEquals("abc", emp.getFirstName());
	}

}
