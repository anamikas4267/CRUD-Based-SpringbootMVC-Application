 package com.anamika.controller;

import java.util.List;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.anamika.bean.Employee;
import com.anamika.bean.User;
import com.anamika.model.exception.EmployeeNotFoundException;
import com.anamika.model.service.EmployeeService;
import com.anamika.model.service.LoginService;
//import com.mysql.cj.Session;

@Controller
@SessionAttributes({"user"})
public class MyEmployeeController {
	@Autowired
	private EmployeeService empService;
	
	@Autowired
	private LoginService loginService;
	 
	@RequestMapping("/")
	public ModelAndView loginPage() {
		System.out.println("login");
		return new ModelAndView("login","command",new User());
	}
	
	@RequestMapping("/loginCheck")
	public ModelAndView loginCheckController(@ModelAttribute("command") User user/*, HttpSession session*/) {
		if(loginService.loginCheck(user)) {
			ModelAndView mv=new ModelAndView();
		    mv.addObject("user", user);
//		    session.setAttribute("user", user);
		    mv.setViewName("menu");
			return mv;
		}
		return new ModelAndView("login","msg","Login Failed");
	}
	
	@RequestMapping("/menu")
	public ModelAndView showMenu() {
		return new ModelAndView("menu");
	}
	
	@RequestMapping("/insertEmpPage")
		public ModelAndView insertEmpPageController() {
		return new ModelAndView("insertEmpDetails","command",new Employee());
	}
	
	@RequestMapping("/insertEmployee")
	public ModelAndView insertEmployeeController(@ModelAttribute("command") Employee employee) {
		String message=null;
		if(empService.insertEmployee(employee)) {
			message="Employee Saved Successfully";
		}else {
			message="Employee is not Saved";
		}
		return new ModelAndView("output","msg",message);
	}
	
	@RequestMapping("/searchEmpPage")
	public ModelAndView searchEmpPageController() {
		return new ModelAndView("searchEmp");
	}
	
	@RequestMapping("/search")
	public ModelAndView searchEmployee(@RequestParam("empId") int empId) {
		
		Employee employee=null;
		try {
		employee=empService.searchEmployee(empId);
		} 
		catch(EmployeeNotFoundException | EmptyResultDataAccessException e) {}
		return new ModelAndView("employeeDetails","emp" ,employee );
		
	}
	
	@RequestMapping("/deleteEmpPage")
	public ModelAndView deleteEmpPageController() {
		return new ModelAndView("deleteEmp");
	}
	
	@RequestMapping("/delete")
	public ModelAndView deleteEmployee(@RequestParam("empId") int empId) {
		boolean flag=empService.deleteEmployee(empId);
		String message=null;
		if(flag)
			message="Employee deleted successfully!";
		else 
			message="Employee deletion failed";
		return new ModelAndView("output","msg" ,message);
	}
	
	
	@RequestMapping("/updateEmpSalary")
	public ModelAndView updateEmpSalaryController() {
		return new ModelAndView("updateEmpSalaryPage","command",new Employee());
	}
	
	@RequestMapping("/updateSalary")
	public ModelAndView updateSalaryController(@ModelAttribute("command") Employee employee) {
		String message=null;
		if(empService.updateSalary(employee.getEmpId(), employee.getEmpSalary())) 
			message="Employee Salary Updated successfully!";
		else 
			message="Employee Salary Updation failed";
		return new ModelAndView("output","msg" ,message);
	}
	
	@RequestMapping("/showAllEmployees")
	public ModelAndView showAllEmployeesController() {
		List<Employee> employees=empService.getAllEmployees();
		return new ModelAndView("listAllEmployees","employees",employees);
	}
	

}
