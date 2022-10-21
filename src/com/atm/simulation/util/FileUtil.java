package com.atm.simulation.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import com.atm.simulation.model.Account;
import com.atm.simulation.model.Transaction;


public class FileUtil {

public static final String CSV_SEPARATOR = ",";
	
	public List<Transaction> readTransactionCsv(String path) {
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(path));
			List<Transaction> transactions = new ArrayList<>();
			String line = br.readLine();
			while (line != null) {
				String[] values = line.split(",");
				Transaction transaction = new Transaction(values[0].replaceAll("^\"|\"$", ""), values[1],
						Integer.parseInt(values[2]), Instant.parse(values[3]), values[4].replaceAll("^\"|\"$", ""));
				transactions.add(transaction);
				line = br.readLine();
			}

			br.close();
			return transactions;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new ArrayList<>();
	}
	
	public List<Account> readAccountCsv(String path) {
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(path));
			List<Account> accounts = new ArrayList<>();
			String line = br.readLine();
			while (line != null) {
				String[] values = line.split(",");
				Account account = new Account(values[0].replaceAll("^\"|\"$", ""), values[1], values[2],
						Integer.parseInt(values[3].replaceAll("^\"|\"$", "")));
				accounts.add(account);
				line = br.readLine();
			}
			br.close();
			return accounts;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new ArrayList<>();
	}
	
	public void writeTransactionCsv(String path, Transaction transaction) {
		try {
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path, true), "UTF-8"));
			StringBuilder oneLine = new StringBuilder();
			oneLine.append(transaction.getAccountNumber().trim().length() == 0 ? "" : transaction.getAccountNumber());
			oneLine.append(CSV_SEPARATOR);
			oneLine.append(transaction.getType().trim().length() == 0 ? "" : transaction.getType());
			oneLine.append(CSV_SEPARATOR);
			oneLine.append(transaction.getAmount());
			oneLine.append(CSV_SEPARATOR);
			oneLine.append(transaction.getTime());
			oneLine.append(CSV_SEPARATOR);
			oneLine.append(transaction.getRecepientAccountNumber());
			bw.write(oneLine.toString());
			bw.newLine();
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
