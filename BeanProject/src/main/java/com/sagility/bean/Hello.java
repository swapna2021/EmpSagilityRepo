package com.sagility.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;


@Component
public class Hello {
	
	public String sayHello() {
		return "Hello....!";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Bean initialised");
	}
	
	
	@PreDestroy
	public void destroy() {
		System.out.println("Bean got removed");
	}
	
	
	

}
