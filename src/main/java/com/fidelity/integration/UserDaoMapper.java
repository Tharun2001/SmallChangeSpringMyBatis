package com.fidelity.integration;

import java.util.List;


import com.fidelity.user.Profile;
import com.fidelity.user.User;

public interface UserDaoMapper {
	
	List<Profile> getAllUsers();
	int signUpUser(Profile p);
	int deleteUser(String username);
	int loginUser(User user);
}
