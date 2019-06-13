package com.dc.lwm.service;

import java.util.List;

import com.dc.lwm.entity.StudentInfoView;

public interface StudentInfoViewService {
	public List<StudentInfoView> getAll();
	public StudentInfoView getById(long stuId);
}
