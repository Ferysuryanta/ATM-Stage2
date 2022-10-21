package com.atm.simulation.util;

import java.util.Random;

public class DataUtil {

	public boolean isNumeric(String str) {
		return str.chars().allMatch(Character::isDigit);
	}
	
	public boolean accountNumberValidationFormat(String accountNumber) {
		if (!isNumeric(accountNumber)) {
			System.out.println("Account Number should only contains numbers");
			return Boolean.FALSE;
		} else if (accountNumber.length() != 6) {
			System.out.println("Account Number should have 6 digits length");
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}
	
	public boolean pinValidationFormat(String pin) {
		if (!isNumeric(pin)) {
			System.out.println("PIN should only contains numbers");
			return Boolean.FALSE;
		} else if (pin.length() > 6) {
			System.out.println("PIN should have 6 digits length");
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}
	
	public Integer generateReferenceNumber() {
		Random rnd = new Random();
		return 100000 + rnd.nextInt(900000);
	}
}