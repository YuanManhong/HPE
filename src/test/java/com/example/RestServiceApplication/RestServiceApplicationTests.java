package com.example.RestServiceApplication;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class RestServiceApplicationTests {

	@Mock
	private EmployeeManager employeeManager;

	// Helper function to get the number of current employees
	int getEmployeeCount(EmployeeManager manager)
	{
		return manager.getAllEmployees().getEmployeeList().size();
	}

	@BeforeEach
	void setUp()
	{
		this.employeeManager = new EmployeeManager();
		Employee newEmployee = new Employee("djones3", "Daria", "Jones", "dariajones@gmail.com", "Software developer");
		this.employeeManager.addEmployee(newEmployee);
	}
	@Test
	void createEmployeeManager(){
		EmployeeManager employeeManager = new EmployeeManager();
		assertNotEquals(0, employeeManager.getAllEmployees().getNumOfEmployees());
	}

	@Test
	void addEmployee(){
		EmployeeManager em = new EmployeeManager();
		int num = em.getAllEmployees().getNumOfEmployees();
		Employee e = new Employee("donald","duck","001", "donlad.com", "manager");
		em.addEmployee(e);
		assertEquals (num + 1, getEmployeeCount(em));

	}

	@Test
	void employeeIdInList(){
		List<Employee> employeeList = this.employeeManager.getAllEmployees().getEmployeeList();
		for (int i = 0; i < employeeList.size(); i++){
			Employee e = employeeList.get(i);
			if (e.getEmployeeID() == "Jones"){
				return;
			}
		}
		assert(false);
	}

	@Test
	void employeeFirstNameInList(){
		List<Employee> employeeList = this.employeeManager.getAllEmployees().getEmployeeList();
		for (int i = 0; i < employeeList.size(); i++){
			Employee e = employeeList.get(i);
			if (e.getFirstName() == "djones3"){
				return;
			}
		}
		assert(false);
	}

	@Test
	void employeeLastNameInList(){
		List<Employee> employeeList = this.employeeManager.getAllEmployees().getEmployeeList();
		for (int i = 0; i < employeeList.size(); i++){
			Employee e = employeeList.get(i);
			if (e.getLastName() == "Daria"){
				return;
			}
		}
		assert(false);
	}

	@Test
	void employeeEmailInList(){
		List<Employee> employeeList = this.employeeManager.getAllEmployees().getEmployeeList();
		for (int i = 0; i < employeeList.size(); i++){
			Employee e = employeeList.get(i);
			if (e.getEmail() == "dariajones@gmail.com"){
				return;
			}
		}
		assert(false);
	}

	@Test
	void employeeTitileInList(){
		List<Employee> employeeList = this.employeeManager.getAllEmployees().getEmployeeList();
		for (int i = 0; i < employeeList.size(); i++){
			Employee e = employeeList.get(i);
			if (e.getTitle() == "Software developer"){
				return;
			}
		}
		assert(false);
	}
}
