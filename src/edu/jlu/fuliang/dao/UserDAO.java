package edu.jlu.fuliang.dao;

import java.util.List;

import edu.jlu.fuliang.domain.User;

public interface UserDAO {
	public User findById(long id);
	public void save(User user);
	public List<User>  findByUserNameAndPassword(String userName,String password);
	public List<User>  findByUserName(String userName);
}
