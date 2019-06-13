package com.dc.lwm.dao;

import java.util.List;

import com.dc.lwm.entity.StudentInfoView;

public interface StudentInfoViewDao {
	public List<StudentInfoView> findAll();
	public StudentInfoView queryById(long stuId);
}
