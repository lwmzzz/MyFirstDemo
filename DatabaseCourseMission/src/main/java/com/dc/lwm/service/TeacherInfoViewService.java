package com.dc.lwm.service;

import java.util.List;

import com.dc.lwm.entity.TeacherInfoView;

public interface TeacherInfoViewService {
	public List<TeacherInfoView> getAll();
	public TeacherInfoView getById(long teaId);
}
