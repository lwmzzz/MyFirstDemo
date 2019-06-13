package com.dc.lwm.dao;

import java.util.List;

import com.dc.lwm.entity.TeacherInfoView;

public interface TeacherInfoViewDao {
	public List<TeacherInfoView> findAll();
	public TeacherInfoView queryById(long teaId);
}
