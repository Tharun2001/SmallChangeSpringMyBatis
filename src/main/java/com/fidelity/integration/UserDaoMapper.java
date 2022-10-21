package com.fidelity.integration;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.fidelity.user.Profile;

public interface UserDaoMapper {
	
	List<Profile> getAllUsers();
}
