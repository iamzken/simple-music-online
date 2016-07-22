package edu.jlu.fuliang.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.jlu.fuliang.dao.UserDAO;
import edu.jlu.fuliang.domain.User;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO{

	public User findById(long id) {
		return (User)getHibernateTemplate().get(User.class, id);
	}

	
	public List<User> findByUserName(String userName) {
		return getHibernateTemplate().find("from User where userName=?",new String[]{userName});
	}

	
	public List<User>  findByUserNameAndPassword(String userName, String password) {
		return getHibernateTemplate().find("from User where userName=? and password=?",new String[]{userName,password});
	}

	
	public void save(User user) {
		getHibernateTemplate().saveOrUpdate(user);
	}

}
