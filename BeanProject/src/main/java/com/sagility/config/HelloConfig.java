package com.sagility.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.sagility.bean.Hello;

@Configuration
public class HelloConfig {
	
	@Bean(name="hello")
	@Scope("prototype")
	public Hello getHelloBean() {
		return new Hello();
	}
	
	
	
	

}
