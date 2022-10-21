package com.atm.simulation.model;

import java.time.Instant;

public class Transaction {

	private String accountNumber;
	private String type;
	private Integer amount;
	private Instant time;
	private String recepientAccountNumber;

	public Transaction() {
	}

	public Transaction(String accountNumber, String type, Integer amount, Instant time, String recepientAccountNumber) {
		this.accountNumber = accountNumber;
		this.type = type;
		this.amount = amount;
		this.time = time;
		this.recepientAccountNumber = recepientAccountNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Instant getTime() {
		return time;
	}

	public void setTime(Instant time) {
		this.time = time;
	}

	public String getRecepientAccountNumber() {
		return recepientAccountNumber;
	}

	public void setRecepientAccountNumber(String recepientAccountNumber) {
		this.recepientAccountNumber = recepientAccountNumber;
	}
}
