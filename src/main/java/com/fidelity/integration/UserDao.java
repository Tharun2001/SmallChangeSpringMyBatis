package com.fidelity.integration;

import java.util.List;

import com.fidelity.user.Profile;
import com.fidelity.user.User;
import com.fidelity.user.UserPreferences;

public interface UserDao {
	List<Profile> getAllUsers();
	int signupUser(Profile p);
	int deleteUser(String username);
	int loginUser(User user);
	int setUserPreferences(UserPreferences up);
}
