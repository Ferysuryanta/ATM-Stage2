package com.atm.simulation;

import java.util.List;

import com.atm.simulation.model.Account;
import com.atm.simulation.service.TransactionService;
import com.atm.simulation.constant.Constant;
import com.atm.simulation.util.FileUtil;

public class Main {
	public static void main(String[] args) {
		TransactionService transactionService= new TransactionService();
		FileUtil fileUtil = new FileUtil();
		List<Account> accounts = fileUtil.readAccountCsv(Constant.ACCOUNT_FILE_PATH);

		transactionService.mainApp(accounts);
	}
}