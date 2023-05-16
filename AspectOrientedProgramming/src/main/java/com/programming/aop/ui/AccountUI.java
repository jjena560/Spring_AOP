package com.programming.aop.ui;


import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.programming.aop.config.AppConfig;
import com.programming.aop.model.Account;
import com.programming.aop.service.AccountService;

public class AccountUI {
	
    private static Account account;
    
    @SuppressWarnings("resource")
	public static void main(String[] args) {
    	@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	AccountService accService = context.getBean("accountService", AccountService.class);
            
    	System.out.print("Enter name:\n");
        String name = scn.next();
        
        
        
        System.out.print("Enter phone number");
        int phone =(scn.nextInt());
        createAccount(name, phone);
    	
    	accService.deposit(account, 1000000000);

        
    }
    
    private static void createAccount(String name, int phone) {
    	account = new Account(name, phone);		
	}

	private static void createAccount(Account account2) {
        int phone = account2.getPhone();
        account = new Account(account2.getName(), phone);
    }
    
//    private static void deposit(double amount, Account account) {
//        if (account != null) {
//            
//        	accService.deposit(account, amount);
//            
//        }
//    }
    
    private static void withdraw(double amount) {
        if (account != null) {
            account.withdraw(amount);
        }
    }
    
   
}
