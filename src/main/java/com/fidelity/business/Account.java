package com.fidelity.business;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Account {
	private String acct_num;
	private String type;
	private List<BankAccount> bankAccounts;
	private List<Holding> portfolio;
	private List<Trade> trades;
	
	public Account() {
		super();
	}
	
	public Account(String acct_num, String type) {
		super();
		this.acct_num = acct_num;
		this.type = type;
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
	
	public List<Holding> getPortfolio() {
		return portfolio;
	}
	public void setPortfolio(List<Holding> portfolio) {
		this.portfolio = portfolio;
	}
	
	public List<Trade> getTrades() {
		return trades;
	}
	
	public void setTrades(List<Trade> trades) {
		this.trades = trades;
	}
	
}
