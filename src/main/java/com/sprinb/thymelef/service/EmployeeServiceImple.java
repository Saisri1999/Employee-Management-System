package com.sprinb.thymelef.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sprinb.thymelef.entity.Employee;
import com.sprinb.thymelef.repository.EmployeeRepository;

@Service
public class EmployeeServiceImple implements EmployeeService{
	
	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImple(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(Long id) {
		return employeeRepository.findById(id).get();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployeeById(Long id) {
		employeeRepository.deleteById(id);
		
	}

}
