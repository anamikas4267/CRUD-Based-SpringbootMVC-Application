package com.anamika.bean;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Employee {
	
	
	private int empId;
	private String empName;
	private String empDepartment;
	private String empDesignation;
	private int empSalary;
	
	

}
