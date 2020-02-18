package com.airport.mgmt.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.airport.mgmt.dao.UserDao;
import com.airport.mgmt.form.User;

@Service
public class UserServiceImpl implements UserService {

	private static Logger log=Logger.getLogger(UserServiceImpl.class);
	
	
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	@Transactional
	public void addUser(User user) {
		// TODO Auto-generated method stub
		log.info("Inside service's addUser");
		userDao.addUser(user);
	}

	@Override
	@Transactional
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		log.info("Inside service's updateUser");
		userDao.updateUser(user);
	}

	@Override
	@Transactional
	public List<User> listUser() {
		// TODO Auto-generated method stub
		log.info("Inside service's listUser");
		List<User> list=userDao.listUser();
		return list;
	}

	@Override
	@Transactional
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		log.info("Inside service's getUserById");
		User user=userDao.getUserById(userId);
		return user;
	}

	@Override
	@Transactional
	public boolean getUserByName(String userName,String password,String type) {
		// TODO Auto-generated method stub
		log.info("Inside service's getUserByName");
		boolean v=userDao.getUserByName(userName,password,type);
		return v;
	}
	
	@Override
	@Transactional
	public void deleteUser(int userId) {
		// TODO Auto-generated method stub
		log.info("Inside service's deleteUser");
		userDao.deleteUser(userId);
	}
}
