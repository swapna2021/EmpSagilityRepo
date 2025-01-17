package com.sagility.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@ResponseBody

public class HelloController {
	
	public static String name="Sagility";
	
	@RequestMapping("/index")
	public ModelAndView sayHello() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("index");
		return mv;
	}
	
	@RequestMapping("/login")
	public ModelAndView doLogin() {
		System.out.println("login working");
		ModelAndView mv=new ModelAndView();
		mv.addObject("login");
		return mv;
	}
	
	
	@RequestMapping("/auth")
	public ModelAndView fromLogin(@RequestParam("uname")String uname,
			@RequestParam("pwd")String pwd	) {
		String name=uname;
		String password=pwd;
		
		if(uname.equals("swapna")&&pwd.equals("12345")) {
			 ModelAndView mv= new ModelAndView("welcome");
			 mv.addObject("uname",uname);
			 return mv;
		}
		else
			 return new ModelAndView("error");
				
	}
	

	@RequestMapping("/print")
	public String printHello() {
		return "Hello";
	}

}
