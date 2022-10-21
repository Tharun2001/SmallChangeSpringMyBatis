package com.fidelity.integration;

import java.util.List;
import com.fidelity.business.BankAccount;

public interface BankAccountDao {
	List<BankAccount> getBankAccounts(String acctnum);
	void insertBankAccount(BankAccount acct);
	void updateBankAccount(BankAccount acct);
	void deleteBankAccount(String acctnum);
}
