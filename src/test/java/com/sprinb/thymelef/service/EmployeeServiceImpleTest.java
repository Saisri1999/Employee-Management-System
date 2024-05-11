package com.sprinb.thymelef.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.sprinb.thymelef.entity.Employee;
import com.sprinb.thymelef.repository.EmployeeRepository;
@SpringBootTest
class EmployeeServiceImpleTest {

	@Autowired
	private EmployeeService employeeService;
	@MockBean
	private EmployeeRepository employeeRepository;
	@BeforeEach
	void setUp() {
		Optional<Employee> employee =Optional.of(new Employee("xyz","abc",85632.42,"xyx@gmail.com",25));
		Mockito.when(employeeRepository.findById(5l)).thenReturn(employee);
	}
	@Test
	public void testGetEmployeeById_Success() {
		String firstName="xyz";
		Employee empById = employeeService.getEmployeeById(5l);
		assertEquals(firstName, empById.getFirstName());
	}
}
