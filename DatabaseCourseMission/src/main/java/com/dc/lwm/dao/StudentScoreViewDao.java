package com.dc.lwm.dao;

import java.util.List;

import com.dc.lwm.entity.StudentScoreView;

public interface StudentScoreViewDao {
	public List<StudentScoreView> finAll();
	public List<StudentScoreView> queryById(long stuId);
	public List<StudentScoreView> queryByTeaId(long teaId);
	public List<StudentScoreView> queryByTeaIdCourseId(long teaId,long courseId);
	public StudentScoreView queryByStuIdCourseId(long stuId,long courseId);
}
