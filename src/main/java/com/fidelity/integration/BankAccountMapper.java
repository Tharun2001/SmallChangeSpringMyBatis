package com.fidelity.integration;

import java.util.List;

import com.fidelity.business.BankAccount;

public interface BankAccountMapper {
	List<BankAccount> getBankAccounts(String acctnum);
}
