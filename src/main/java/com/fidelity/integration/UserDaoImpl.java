package com.fidelity.integration;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fidelity.user.Profile;
import com.fidelity.user.User;
import com.fidelity.user.UserPreferences;

@Repository("usersDao")
public class UserDaoImpl implements UserDao {
	
	private Logger logger;

	@Autowired
	UserDaoMapper userMapper;

	@Override
	public List<Profile> getAllUsers() {
		//logger.debug("enter getAllUsers");
		return userMapper.getAllUsers();
	}

	@Override
	public int signupUser(Profile p) {
		//logger.debug("enter signupUser");
		return userMapper.signUpUser(p);
	}

	@Override
	public int deleteUser(String username) {
		//logger.debug("enter deleteUser");
		return userMapper.deleteUser(username);
	}

	@Override
	public int loginUser(User user) {
		//logger.debug("enter loginUser");
		return userMapper.loginUser(user);
	}

	@Override
	public int setUserPreferences(UserPreferences up) {
		return userMapper.setUserPreferences(up);
	}


}
