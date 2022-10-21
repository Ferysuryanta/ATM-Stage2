package com.atm.simulation.model;

public class Account {

	private String accountNumber;
	private String name;
	private String pin;
	private Integer balance;

	public Account() {
	}

	public Account(String accountNumber, String name, String pin, Integer balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.pin = pin;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}
}