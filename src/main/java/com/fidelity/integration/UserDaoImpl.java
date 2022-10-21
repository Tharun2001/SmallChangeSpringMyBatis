package com.fidelity.integration;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fidelity.user.Profile;
import com.fidelity.user.User;

@Repository("usersDao")
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private Logger logger;

	@Autowired
	UserDaoMapper userMapper;

	@Override
	public List<Profile> getAllUsers() {
		logger.debug("enter getAllUsers");
		return userMapper.getAllUsers();
	}

	@Override
	public void signupUser(Profile p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(String username) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean loginUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
