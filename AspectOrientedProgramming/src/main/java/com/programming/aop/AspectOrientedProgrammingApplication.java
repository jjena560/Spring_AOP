package com.programming.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.programming.aop.service.AccountService;

@SpringBootApplication
@ComponentScan(basePackages = {"com.programming.aop"})
@EnableAspectJAutoProxy
public class AspectOrientedProgrammingApplication {
	@Autowired
	private static AccountService accountService;

	public static void main(String[] args) {
		SpringApplication.run(AspectOrientedProgrammingApplication.class, args);
		
		
	}

}
