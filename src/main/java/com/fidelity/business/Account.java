package com.fidelity.business;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private String acct_num;
	private String type;
	private List<BankAccount> bankAccounts;
	
	public Account() {
		super();
	}
	
	public Account(String acct_num, String type) {
		super();
		this.bankAccounts = new ArrayList<>();
		this.acct_num = acct_num;
		this.type = type;
	}
	
	public void addAccount(BankAccount account) {
		bankAccounts.add(account);
	}
	
	public void removeAccount(BankAccount account) {
		if(bankAccounts.contains(account)) {
			bankAccounts.remove(account);
		}
		else {
			throw new IllegalArgumentException("Provided account is not present.");
		}
	}
	public BankAccount getBankAccount(BankAccount account) {
		for (BankAccount ele : bankAccounts) {
		    if (ele.equals(account)) {
		      return account;
		    }
		}
		throw new IllegalArgumentException("Provided account is not present.");
	}
	
	public int getNoOfBankAccounts() {
		return bankAccounts.size();
	}
	
	public String getAcct_num() {
		return acct_num;
	}
	public void setAcct_num(String acct_num) {
		this.acct_num = acct_num;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<BankAccount> getBankAccounts() {
		return bankAccounts;
	}
	public void setBankAccounts(List<BankAccount> bankAccounts) {
		this.bankAccounts = bankAccounts;
	}
	
	
}
