package com.sagility.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sagility.bean.User;

import ch.qos.logback.core.model.Model;


//@Controller
//@RequestMapping("/api/v1/user")
//@ResponseBody
@RestController
public class UserController {
	
	@RequestMapping("/create")
	public ModelAndView createUser() {
		
		User u=new User("Amit",123);
		ModelAndView mv=new ModelAndView("userinfo");
		mv.addObject("user",u);
		return mv;
		
	}
	
	

}
