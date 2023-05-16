package com.programming.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAspect {
	@Pointcut("execution(* com.programming.aop.service.AccountService.*(..))")
	private void accountServiceMethods() {
	}
	
	@Before("execution(* com.programming.aop.service.AccountService.deposit(..))")
	private void beforeDeposit() {
		System.out.println("Deppsit done...");
	}

	@Around("accountServiceMethods()")
	public Object logMethodCall(ProceedingJoinPoint joinPoint) throws Throwable {
		String methodName = joinPoint.getSignature().getName();
		Object[] args = joinPoint.getArgs();
		System.out.println("Method called: " + methodName);
		System.out.println("Arguments: ");
		for (Object arg : args) {
			System.out.println(arg);
		}
		Object result = joinPoint.proceed();
		System.out.println("Method returned: " + result);
		return result;
	}
}
