package com.fidelity.integration;

import java.util.List;

import com.fidelity.business.Holding;

public interface HoldingDao {
	List<Holding> getAllHoldings(String acctnum);
}
