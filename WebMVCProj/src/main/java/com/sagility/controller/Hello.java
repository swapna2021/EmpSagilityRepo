package com.sagility.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class Hello {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello Swapna...!";
	}

}
