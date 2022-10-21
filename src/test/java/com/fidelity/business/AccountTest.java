package com.fidelity.business;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AccountTest {

	Account account;
	BankAccount bankAccount1, bankAccount2, bankAccount3;
	List<BankAccount> bankAccounts;
	
	@BeforeEach
	void setUp() {
		account = new Account("ABC123","Brokerage");
		bankAccount1 = new BankAccount("ABC123","Account1", "Bank", BigDecimal.valueOf(100000));
		bankAccount2 = new BankAccount("ABC123", "Account2", "Bank", BigDecimal.valueOf(200000));
		bankAccount3 = new BankAccount("ABC123", "Account3", "Bank", BigDecimal.valueOf(300000));
		account.addAccount(bankAccount1);
	}

	@AfterEach
	void tearDown(){
		account = null;
	}

	@Test
	void creation_Success() {
		assertNotNull(account);
	}
	

	
	@Test
	void addAccount() {
		account.addAccount(bankAccount2);
		assertEquals(account.getNoOfBankAccounts(), 2);
	}
	
	@Test
	void removeAccount_Success() {
		account.removeAccount(bankAccount1);
		assertEquals(account.getNoOfBankAccounts(), 0);
	}
	
	@Test
	void removeAccount_NotPresent_Exception() {
		assertThrows(IllegalArgumentException.class, () -> {
			account.removeAccount(bankAccount3);
		});
	}
	
	@Test
	void getsNumberOfAccounts() {
		assertEquals(account.getNoOfBankAccounts(), 1);
	}
	
	@Test
	void getsAccount_Success() {
		account.addAccount(bankAccount2);
		
		assertEquals(account.getBankAccount(bankAccount1), bankAccount1);
	}
	
	@Test
	void getsAccount_NotPresent_Exception() {
		account.addAccount(bankAccount2);
		assertThrows(IllegalArgumentException.class, () -> { 
			account.getBankAccount(bankAccount3);
		});
	}
	
	@Test
	void generatesHash() {
		assertNotNull(account.hashCode());
	}

}
