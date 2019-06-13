package com.dc.lwm.service;

import java.util.List;

import com.dc.lwm.entity.StudentScoreView;

public interface StudentScoreViewService {
	public List<StudentScoreView> getAll();
	public List<StudentScoreView> getByTeaId(long teaId);
	public List<StudentScoreView> getByteaIdCourseId(long teaId,long courseId);
	public List<StudentScoreView> getByStuId(long stuId);
	public StudentScoreView getByStuIdCourseId(long stuId,long courseId);
}
