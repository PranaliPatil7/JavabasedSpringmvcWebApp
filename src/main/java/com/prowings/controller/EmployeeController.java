package com.prowings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.prowings.model.Employee;
import com.prowings.service.EmployeeService;
@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = "/createNewEmployee", method=RequestMethod.POST)
	public ModelAndView createEmployee(@ModelAttribute("employee") Employee employee)
	{
//		Employee emp=new Employee();
//		emp.setId(employee.getId());
//		emp.setName(employee.getName());
//		emp.setPhone(employee.getPhone());
//		employeeService.createEmployee(emp);
		employeeService.createEmployee(employee);		
//		return "employeeView";
		
		ModelAndView mv=new ModelAndView();
		mv.addObject(employee);
		mv.setViewName("viewEmployee");
		return mv;
		
	}
	@RequestMapping(value = "/getEmployeeById", method = RequestMethod.GET)	
	public ModelAndView getEmployeeById(@RequestParam int id)
	{
		Employee emp=employeeService.getEmployeeById(id);		
		
		ModelAndView mv=new ModelAndView();

		if(null !=emp)
		{
		mv.addObject(emp);
		mv.setViewName("viewEmployee");
		return mv;
		}
		else
		{
			mv.setViewName("getEmpException");
			return mv;
		}
	}

}