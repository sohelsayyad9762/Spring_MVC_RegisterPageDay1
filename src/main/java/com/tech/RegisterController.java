package com.tech;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {

	public RegisterController() {
		System.out.println("inside RegisterController Constructor");
	}
	
	@RequestMapping("/register")
	public ModelAndView Register() {
		
		System.out.println("Register Method");
		ModelAndView mav=new ModelAndView("success");
		return mav;
	}
	
	@RequestMapping("/login")
	public ModelAndView login() {
		System.out.println("login method");
		
		ModelAndView mav=new ModelAndView("log-suc");
		return mav;
	}
	
}
