package com.fidelity.integration;

import java.util.List;

import com.fidelity.business.Account;


public interface AccountDao {
	List<Account> getAccounts();
}
