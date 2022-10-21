package com.fidelity.integration;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import com.fidelity.business.BankAccount;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:beans.xml")
@Transactional
class BankAccountDaoTest {
	@Autowired
	private BankAccountDao dao;
	
	@Test
	void testGetBankAccounts() {
		List<BankAccount> accts = dao.getBankAccounts("ABC123");
		assertTrue(accts.size() > 0);
	}
	
}
