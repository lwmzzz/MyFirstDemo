package com.dc.lwm.dao;

import java.util.List;
import com.dc.lwm.entity.StudentStateView;

public interface StudentStateViewDao {
	public List<StudentStateView> findAll();
	public StudentStateView queryById(long stuId);
}
