/**
 * 
 */
package com.dc.lwm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dc.lwm.dao.UserDao;
import com.dc.lwm.entity.User;
import com.dc.lwm.service.UserService;

/**
 * @author 李巍岷
 * @date 2019年6月5日
 *
 * 
 */
@Service("UserService")
@Transactional
public class UserServiceimpl implements UserService {
	@Autowired
	private UserDao userDao;
	public User login(long userId, String passWd) {

		return userDao.queryById(userId, passWd);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.dc.lwm.service.UserService#updateUser(com.dc.lwm.entity.User)
	 */
	public int updateUser(User user) {
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.dc.lwm.service.UserService#getAll()
	 */
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

}
