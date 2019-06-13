package com.dc.lwm.service;

import java.util.List;

import com.dc.lwm.entity.StudentStateView;

public interface StudentStateViewService {
	public List<StudentStateView> getAll();
	public StudentStateView getById(long stuId);
}
