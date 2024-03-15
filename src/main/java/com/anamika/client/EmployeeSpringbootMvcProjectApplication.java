package com.anamika.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.anamika")
public class EmployeeSpringbootMvcProjectApplication{

	public static void main(String[] args) {
		SpringApplication.run(EmployeeSpringbootMvcProjectApplication.class, args);
	}


}
