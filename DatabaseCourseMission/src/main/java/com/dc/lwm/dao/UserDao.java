package com.dc.lwm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dc.lwm.entity.User;

public interface UserDao {
	/**
	 * 添加学生
	 * 
	 * @param student 学生信息
	 * @return 插入结果 !=0则插入成功
	 */
	public User queryById(@Param("userId") long userId, @Param("pwd") String pwd);

	/**
	 * 添加学生
	 * 
	 * @param student 学生信息
	 * @return 插入结果 !=0则插入成功
	 */
	public int modifyById(@Param("userId") long userId, @Param("newPwd") String newPwd);
	
	public List<User> findAll();

}
