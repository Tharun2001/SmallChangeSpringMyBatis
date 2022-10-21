package com.fidelity.integration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.List;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import com.fidelity.user.Profile;
import com.fidelity.user.User;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:beans.xml")
@Transactional
public class UserDaoImplTest {
	
	@Autowired
	private UserDaoImpl dao;
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Test
	void testGetAllUsers() {
		List<Profile> users = dao.getAllUsers();
		assertTrue(users.size() > 0);
	}
	
	@Test
	void testSignUpNewUser() {
		int count = dao.signupUser(new Profile("Elend", "Venture", LocalDate.now(), "Elend", "elend", "elend@smallchange.com", "+91-1234567890", 5));
		assertEquals(count, 1);
	}
	
	@Test
	void testSignUpNewUserWithExistingUsername() {
		assertThrows(DuplicateKeyException.class, () -> {
			int count = dao.signupUser(new Profile("Elend", "Venture", LocalDate.now(), "Aryan", "elend", "elend@smallchange.com", "+91-1234567890", 5));
	    });
	}
	
	@Test
	void testLoginUserWithCorrectCredentials() {
		int count = dao.loginUser(new User("Aryan", "aryan"));
		assertEquals(count, 1);
	}
	
	@Test
	void testLoginUserWithIncorrectCredentials() {
		int count = dao.loginUser(new User("Aryan", "aryan1"));
		assertEquals(count, 0);
	}
	
	@Test
	void testDeletingNonExistentUser() {
		int count = dao.deleteUser("ARY");
		assertEquals(count, 0);
	}
	
	@Test
	void testDeletingValidUser() {
		dao.signupUser(new Profile("Elend", "Venture", LocalDate.now(), "Elend", "elend", "elend@smallchange.com", "+91-1234567890", 5));
		int count = dao.deleteUser("Elend");
		assertEquals(count, 1);
	}
}
