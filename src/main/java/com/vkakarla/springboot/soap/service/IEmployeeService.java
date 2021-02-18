package com.vkakarla.springboot.soap.service;

import com.vkakarla.springboot.soap.entities.Employee;

public interface IEmployeeService {

	 void AddEmployee(Employee employee);
	 
	 Employee getEmployeeById(long employeeId);
	 
     void updateEmployee(Employee employee);
     
     void deleteEmployee(long employeeId);
}
