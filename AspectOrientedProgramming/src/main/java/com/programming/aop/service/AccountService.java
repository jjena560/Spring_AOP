package com.programming.aop.service;

import org.springframework.stereotype.Service;

import com.programming.aop.model.Account;

@Service
public interface AccountService {
    void deposit(Account account, double amount);
    void withdraw(Account account, double amount);
    void transfer(Account fromAccount, Account toAccount, double amount);
}
