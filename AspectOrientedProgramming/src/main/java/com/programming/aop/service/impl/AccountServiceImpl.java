package com.programming.aop.service.impl;

import org.springframework.stereotype.Component;

import com.programming.aop.model.Account;
import com.programming.aop.service.AccountService;

@Component
public class AccountServiceImpl implements AccountService {
	public void deposit(Account account, double amount) {
		double currentBalance = account.getBalance();
		account.setBalance(currentBalance + amount);
	}

	public void withdraw(Account account, double amount) {
		double currentBalance = account.getBalance();
		if (currentBalance < amount) {
			throw new IllegalArgumentException("Insufficient funds in account");
		}
		account.setBalance(currentBalance - amount);
	}

	public void transfer(Account fromAccount, Account toAccount, double amount) {
		withdraw(fromAccount, amount);
		deposit(toAccount, amount);
	}
}
