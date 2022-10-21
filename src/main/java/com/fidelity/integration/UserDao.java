package com.fidelity.integration;

import java.util.List;

import com.fidelity.user.Profile;
import com.fidelity.user.User;

public interface UserDao {
	List<Profile> getAllUsers();
	void signupUser(Profile p);
	void deleteUser(String username);
	boolean loginUser(User user);
}
