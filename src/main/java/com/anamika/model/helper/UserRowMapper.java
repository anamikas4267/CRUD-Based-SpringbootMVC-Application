package com.anamika.model.helper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.anamika.bean.User;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user=new User(rs.getString("username"),rs.getString("password"));
		return user;
	}

}
