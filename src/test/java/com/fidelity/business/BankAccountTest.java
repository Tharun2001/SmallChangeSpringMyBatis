package com.fidelity.business;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankAccountTest {

	BankAccount bankAccount;
	
	@BeforeEach
	void setUp() {
		bankAccount = new BankAccount("ABC123", "Account123", "Bank", BigDecimal.valueOf(100000));
	}

	@AfterEach
	void tearDown(){
		bankAccount = null;
	}

	@Test
	void creation_Success() {
		assertNotNull(bankAccount);
	}
	
	@Test
	void creation_NullAccNumber_Exception() {
		assertThrows(IllegalArgumentException.class, () -> {
			new BankAccount("ABC123", null, "Bank", BigDecimal.valueOf(100000));
		});
	}
	
	@Test
	void creation_EmptyAccNumber_Exception() {
		assertThrows(IllegalArgumentException.class, () -> {
			new BankAccount("ABC123", null, "", BigDecimal.valueOf(100000));
		});
	}
	
	@Test
	void creation_NullBankname_Exception() {
		assertThrows(IllegalArgumentException.class, () -> {
			new BankAccount("ABC123", "Account123", null, BigDecimal.valueOf(100000));
		});
	}
	
	@Test
	void creation_EmptyBankname_Exception() {
		assertThrows(IllegalArgumentException.class, () -> {
			new BankAccount("ABC123", "Account123", "", BigDecimal.valueOf(100000));
		});
	}
	
	@Test
	void creation_NegativeBalance_Exception() {
		assertThrows(IllegalArgumentException.class, () -> {
			new BankAccount("ABC123", "Account123", "Bank", BigDecimal.valueOf(-1));
		});
	}
	
	@Test
	void debitAmt_Success() {
		BigDecimal before = bankAccount.getBalance();
		bankAccount.debitAmt(BigDecimal.valueOf(50000));
		assertEquals(bankAccount.getBalance(), before.subtract(BigDecimal.valueOf(50000)));
	}
	
	@Test
	void debitAmt_LessBalance_Exception() {
		assertThrows(IllegalArgumentException.class, () -> {
			bankAccount.debitAmt(BigDecimal.valueOf(200000));
		});
	}
	
	@Test
	void creditAmt() {
		BigDecimal before = bankAccount.getBalance();
		bankAccount.creditAmt(BigDecimal.valueOf(50000));
		assertEquals(bankAccount.getBalance(), before.add(BigDecimal.valueOf(50000)));
	}
	
	@Test
	void checkEquals_True() {
		assertTrue(bankAccount.equals(new BankAccount("ABC123", "Account123", "Bank", BigDecimal.valueOf(100000) )));
	}
	
	@Test
	void checkEquals_False() {
		assertFalse(bankAccount.equals(new BankAccount("ABC123","Account200", "Bank", BigDecimal.valueOf(100000))));
	}
	
	@Test
	void generatesHashCode() {
		assertNotNull(bankAccount.hashCode());
	}

}
