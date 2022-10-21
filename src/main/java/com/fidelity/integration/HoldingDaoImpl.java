package com.fidelity.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.fidelity.business.Holding;

@Repository("holdingsDao")
@Primary
public class HoldingDaoImpl implements HoldingDao{
	@Autowired
	private HoldingMapper mapper;
	
	@Override
	public List<Holding> getAllHoldings(String acctnum) {
		return mapper.getAllHoldings(acctnum);
	}

}
