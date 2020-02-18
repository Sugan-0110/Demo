package com.airport.mgmt.service;

import java.util.List;

import com.airport.mgmt.form.User;

public interface UserService {

	public void addUser(User user);
	public void updateUser(User user);
	public List<User> listUser();
	public User getUserById(int userId);
	public boolean getUserByName(String userName, String string, String string2);
	public void deleteUser(int userId);
}
