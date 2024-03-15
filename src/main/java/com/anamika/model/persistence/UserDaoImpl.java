package com.anamika.model.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.anamika.bean.User;
import com.anamika.model.helper.UserRowMapper;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public User getUser(User user) {
		String query="select * from myuser where username=? and password=?";
		User usr=jdbcTemplate.queryForObject(query, new UserRowMapper(), user.getUsername(),user.getPassword());
		return usr;
	}

}
