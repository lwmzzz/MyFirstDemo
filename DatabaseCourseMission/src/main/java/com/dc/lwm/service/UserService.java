/**
 * 
 */
package com.dc.lwm.service;

import java.util.List;

import com.dc.lwm.entity.User;

/**
 * @author 李巍岷
   @date	2019年6月5日
 *
 * 
 */
public interface UserService {
	public User login(long userId,String passWd);
	public int updateUser(User user);
	public List<User> getAll();
}
