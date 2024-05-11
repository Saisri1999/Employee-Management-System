package com.sprinb.thymelef.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.sprinb.thymelef.EmployeeManagementSystemApplication;
import com.sprinb.thymelef.entity.Employee;
import com.sprinb.thymelef.service.EmployeeService;

//@WebMvcTest(EmployeeController.class)
@SpringBootTest(classes =EmployeeManagementSystemApplication.class)
class EmployeeControllerTest {

	@Autowired
	private MockMvc mockMvc;
	@MockBean
	private EmployeeService employeeService;
	
	@BeforeEach
	void setup() {
		Employee employees = new Employee("qwer","poiu",85632.12,"qwer@gmail.com",26);
	}
	@Test
	public void testAddEmployee() throws Exception{
		Employee employee =new Employee("qwer","poiu",85632.12,"qwer@gmail.com",26);
		Mockito.when(employeeService.updateEmployee(employee)).thenReturn(employee);
		mockMvc.perform(MockMvcRequestBuilders.post("/employees").contentType(MediaType.APPLICATION_JSON)
				.content("{\r\n"+"\"firstName\":\"qwer\",\r\n"+"\"lastName\":\"poiu\",\r\n"+"\"salary\":85632.12,\r\n"+"\"email\":\"qwer@gmail.com\",\r\n"+"\"age\":\26,\r\n"+"}")).andExpect(MockMvcResultMatchers.status().isOk());;
	}
}
