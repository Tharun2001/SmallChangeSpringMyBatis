package com.fidelity.integration;

import java.util.List;

import com.fidelity.business.Security;

public interface SecurityDao {
	
	List<Security> getSecurities();
	void insertSecurity(Security security);
	void deleteSecurity(int sId);
	void updateSecurity(Security security);
}
