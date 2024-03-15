package com.anamika.model.persistence;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.anamika.bean.Employee;
import com.anamika.model.exception.EmployeeNotFoundException;
import com.anamika.model.helper.EmployeeRowMapper;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
    @Autowired
	private JdbcTemplate jdbcTemplate;


	@Override
	public ArrayList<Employee> getAllRecords() {
		String query = "SELECT * FROM EMPLOYEES";
		List<Employee> employees = jdbcTemplate.query(query, new EmployeeRowMapper());
		return (ArrayList<Employee>) employees;
	}

	@Override
	public Employee searchRecord(int empId) throws EmployeeNotFoundException {
		String query = "SELECT * FROM EMPLOYEES WHERE ID=?";
		Employee employee = jdbcTemplate.queryForObject(query, new EmployeeRowMapper(), empId);
		if (employee != null)
			return employee;
		throw new EmployeeNotFoundException("Employee with id " + empId + " does not exist");
	}

	@Override
	public boolean insertData(Employee employee) {
		String query = "INSERT INTO EMPLOYEES(ID,NAME,DEPARTMENT,DESIGNATION,SALARY) VALUES(?,?,?,?,?)";
		int rows = jdbcTemplate.update(query, employee.getEmpId(), employee.getEmpName(), employee.getEmpDepartment(),
				employee.getEmpDesignation(), employee.getEmpSalary());
		if (rows > 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean deleteData(int empId) {
        String query="DELETE FROM EMPLOYEES WHERE ID=?";
		int rows=jdbcTemplate.update(query, empId);

		if (rows > 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean updateSalary(int empId, int empSalary){
		String query="UPDATE EMPLOYEES SET SALARY=? WHERE ID=?";
		int rows = jdbcTemplate.update(query, empSalary,empId);

		if (rows > 0)
			return true;
		else
			return false;

	}

}
