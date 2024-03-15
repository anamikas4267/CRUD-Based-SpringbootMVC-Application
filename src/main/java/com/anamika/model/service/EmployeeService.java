package com.anamika.model.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.anamika.bean.Employee;
import com.anamika.model.exception.EmployeeNotFoundException;

public interface EmployeeService {
	ArrayList<Employee> getAllEmployees();
	Employee searchEmployee(int empId) throws EmployeeNotFoundException;
	boolean insertEmployee(Employee employee);
	boolean deleteEmployee(int empId);
	boolean updateSalary(int empId,int salary);
}
