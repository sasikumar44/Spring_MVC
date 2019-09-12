package com.sgic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sgic.sto.User;

@Controller

public class UserController {
	@RequestMapping("Registeration")
	public ModelAndView showRegistrationPage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("userRegister"); 
		return modelAndView;
				
	}
	
	@RequestMapping(value ="register", method=RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute("user")User user) {
		System.out.print(user);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("regResult"); 
		return modelAndView;
				
	}
	

}
