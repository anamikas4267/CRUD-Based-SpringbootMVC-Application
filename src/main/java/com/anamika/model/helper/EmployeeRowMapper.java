package com.anamika.model.helper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.anamika.bean.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		int id=resultSet.getInt("id");
		String na=resultSet.getString("name");
		String deptt=resultSet.getString("department");
		String desig=resultSet.getString("designation");
		int sal=resultSet.getInt("salary");
		
		Employee employee=new Employee(id, na, deptt, desig, sal);
		return employee;
	}

}
