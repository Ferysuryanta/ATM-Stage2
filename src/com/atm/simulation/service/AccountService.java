package com.atm.simulation.service;

import java.util.List;

import com.atm.simulation.model.Account;

public class AccountService {

	public Account searchAccountByAccountNumberAndPin(List<Account> accounts, String accountNumber, String pin) {
		for (Account account : accounts) {
			if (accountNumber.equalsIgnoreCase(account.getAccountNumber()) && pin.equalsIgnoreCase(account.getPin())) {
				return account; 
			}
		}
		return null;
	}
	
	public Account searchAccountByAccountNumber(List<Account> accounts, String accountNumber) {
		for (Account account : accounts) {
			if (account.getAccountNumber().equalsIgnoreCase(accountNumber)) {
				return account;
			}
		}
		return null;
	}
}
