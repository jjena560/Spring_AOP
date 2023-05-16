package com.programming.aop.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.programming.aop.aspect.LogAspect;
import com.programming.aop.service.AccountService;
import com.programming.aop.service.impl.AccountServiceImpl;

@Configuration
@ComponentScan(basePackages = {"com.programming.aop"})
@EnableAspectJAutoProxy
public class AppConfig {
	@Bean
	@Qualifier("accountService")
	public AccountService accountService() {
		return new AccountServiceImpl();
	}

	@Bean
	public LogAspect logAspect() {
		return new LogAspect();
	}
}
