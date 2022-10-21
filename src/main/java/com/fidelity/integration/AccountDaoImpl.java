package com.fidelity.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.fidelity.business.Account;

@Repository("accountsDao")
@Primary
public class AccountDaoImpl implements AccountDao {
	@Autowired
	private AccountMapper mapper;
	
	@Override
	public List<Account> getAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

}
