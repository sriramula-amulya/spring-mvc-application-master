package com.dbs.springmvcapp.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;

import com.dbs.springmvcapp.model.Address;
import com.dbs.springmvcapp.model.Employee;
import com.dbs.springmvcapp.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@ GetMapping("/")
	public String registerForm()
	{
		return "register";
	}
	
	
	@ GetMapping("/register")
    public String registerUser(HttpServletRequest req)
    {
        String name = req.getParameter("name");
        String departmentName=req.getParameter("deptName");
        String date=req.getParameter("dob");
        LocalDate localDate = LocalDate.parse(date);
        
       String state=req.getParameter("state");
       String city=req.getParameter("city");
       String street=req.getParameter("street");
       String zip=req.getParameter("zip");
       
        Employee e1 = new Employee();
        e1.setName(name);
        e1.setDepartmentName(departmentName);
        e1.setDateOfBirth(localDate);
        Address address =new Address();
        address.setCity(city);
        address.setState(state);
        address.setStreet(street);
        address.setZip(zip);
        e1.setAddress(address);
        address.setEmployee(e1);
        employeeService.saveEmployee(e1);
        
        return "dashboard";
    }
	
	@GetMapping(value = "/login")
    public String login(Model model){
        System.out.println("Came inside the login method ");
        
		List<Employee> listOfAllEmployees  = employeeService.listAll();
        listOfAllEmployees.forEach(employee ->  System.out.println(employee));
        return "login";
    }
	
	 @PostMapping("/login")
	    public String loginUser(@RequestParam("name")String username,
	    		@RequestParam("password") String password,
	    		Model model){
	        System.out.println("Inside the POST method of login user");
	        System.out.println("Username is "+username + " password is "+ password);
	        if(username.equalsIgnoreCase(password))
	        {
	        	model.addAttribute("user", username);
	        	return "success";
	        }
	        else
	        {
	        model.addAttribute("error", "Wrong credentials Please login again.....");
	        return "login";
	        }
	 }
	        @GetMapping("/listAll")
	        public String listAllEmployees(Model model){
	        	List<Employee> listOfAllEmployees  = employeeService.listAll();
	            model.addAttribute("employees",listOfAllEmployees);
            return "list";
}
}
