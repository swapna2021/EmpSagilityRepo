package com.sagility;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sagility.bean.Hello;
import com.sagility.config.HelloConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(HelloConfig.class);
        Hello h=(Hello)context.getBean("hello");
        System.out.println(h.sayHello());
        System.out.println(h.hashCode());
        
        Hello h1=(Hello)context.getBean("hello");
        System.out.println(h1.hashCode());
       
    }
}
