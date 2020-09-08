package com.manipal.dao;

import java.util.List;

import com.manipal.model.User;

public interface UserDAO {
	
	public int addUser(User user);
	
	public List<User> showList();
	
	public int delete(int athleteId);

}
