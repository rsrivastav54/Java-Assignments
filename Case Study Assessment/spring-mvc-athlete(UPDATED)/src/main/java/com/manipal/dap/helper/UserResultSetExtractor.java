package com.manipal.dap.helper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.manipal.model.User;

public class UserResultSetExtractor implements ResultSetExtractor<List<User>> {

	public List<User> extractData(ResultSet rs) throws SQLException, DataAccessException {
		List<User> userList = new ArrayList<>();
		while(rs.next()) {
			User user = new User();
			user.setAthleteId(rs.getInt(1));
			user.setAthleteName(rs.getString(2));
			user.setGender(rs.getString(3));
			user.setCategory(rs.getString(4));
			user.setEmailId(rs.getString(5));
			user.setMobile(rs.getString(6));
			userList.add(user);
			}
		
		return userList;
	}

}
