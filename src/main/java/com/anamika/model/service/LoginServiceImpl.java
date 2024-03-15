  package com.anamika.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.anamika.bean.User;
import com.anamika.model.persistence.UserDao;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public boolean loginCheck(User user) {
		User usr=null;
		try {
		usr=userDao.getUser(user);
		}
		catch(EmptyResultDataAccessException e) {}
		return usr!=null;
	}

}
