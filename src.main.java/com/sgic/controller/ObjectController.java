package com.sgic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sgic.sto.Employee;
@Controller
public class ObjectController {
	@RequestMapping("/Object")
	
	public ModelAndView sendObject() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayObject");
		
		Employee emp=new Employee();
		emp.setId(1);
		emp.setName("Sasi");
		emp.setSalary(80000);
		 
		modelAndView.addObject("employee",emp);
		return modelAndView;
	}

}
