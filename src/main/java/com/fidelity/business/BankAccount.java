package com.fidelity.business;

import java.math.BigDecimal;
import java.util.Objects;

public class BankAccount {
	private String acctNum;
	private String bankAccNumber;
	private String bankName;
	private BigDecimal balance;
	
	public BankAccount(String acctNum, String bankAccNumber, String bankName, BigDecimal balance) {
		super();
		this.acctNum = acctNum;
		this.bankAccNumber = bankAccNumber;
		this.bankName = bankName;
		this.balance = balance;
	}
	public String getAcctNum() {
		return acctNum;
	}
	public void setAcctNum(String acctNum) {
		this.acctNum = acctNum;
	}
	public String getBankAccNumber() {
		return bankAccNumber;
	}
	public void setBankAccNumber(String bankAccNumber) {
		this.bankAccNumber = bankAccNumber;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	@Override
	public int hashCode() {
		return Objects.hash(acctNum, balance, bankAccNumber, bankName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		return Objects.equals(acctNum, other.acctNum) && Objects.equals(balance, other.balance)
				&& Objects.equals(bankAccNumber, other.bankAccNumber) && Objects.equals(bankName, other.bankName);
	}
	@Override
	public String toString() {
		return "BankAccount [acctNum=" + acctNum + ", bankAccNumber=" + bankAccNumber + ", bankName=" + bankName
				+ ", balance=" + balance + "]";
	}

	
}
