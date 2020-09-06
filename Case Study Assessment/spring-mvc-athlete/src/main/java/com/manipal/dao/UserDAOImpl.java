package com.manipal.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
 
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.manipal.dap.helper.UserResultSetExtractor;
import com.manipal.model.User;

public class UserDAOImpl implements UserDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int addUser(User user) {
		String query = "INSERT INTO at_table VALUES(?,?,?,?,?,?)";
		int status=jdbcTemplate.update(query, user.getAthleteId(), user.getAthleteName(), user.getGender(), user.getCategory(), user.getEmailId(),
				user.getMobile());
		return status;
	}

	public List<User> showList() {
		String sql = "SELECT * FROM at_table";
		List<User> userList = jdbcTemplate.query(sql, new UserResultSetExtractor());
		return userList;
	}

}
