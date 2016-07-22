package edu.jlu.fuliang.Service.impl;

import java.util.List;

import edu.jlu.fuliang.Service.UserManageService;
import edu.jlu.fuliang.dao.UserDAO;
import edu.jlu.fuliang.domain.User;

public class UserManageServiceImpl implements UserManageService{

	private UserDAO userDAO;
	
	public boolean login(User user) {
		List<User> users = userDAO.findByUserNameAndPassword(user.getUserName(), user.getPassword()) ;
		return users.size() != 0;
	}

	
	
	public void register(User user) {
		userDAO.save(user);
	}
 
	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

}
