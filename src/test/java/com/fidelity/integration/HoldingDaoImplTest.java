package com.fidelity.integration;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import com.fidelity.business.Holding;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:beans.xml")
@Transactional
class HoldingDaoImplTest {

	@Autowired
	private HoldingDao dao;
	
	@Test
	void test() {
		List<Holding> holdings = dao.getAllHoldings("ABC123");
		assertTrue(holdings.size() > 0);
		System.out.println(holdings.get(0));
	}

}
