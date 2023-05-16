package com.programming.aop.model;

public class Account {
    private String accountNumber;
    private double balance;
    private String name;
    private int phone;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Account(String name, int phone) {
    	this.name = name;
    	this.phone = phone;
	}

	public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		this.balance -= amount;
	}

	public void setPhoneNo(int phone) {
		this.phone = phone;
	}

	public int getPhone() {
		return phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name2) {
		this.name = name2;
	}
}
