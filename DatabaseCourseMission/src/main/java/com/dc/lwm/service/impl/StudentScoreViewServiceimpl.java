package com.dc.lwm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dc.lwm.dao.StudentScoreViewDao;
import com.dc.lwm.entity.StudentScoreView;
import com.dc.lwm.service.StudentScoreViewService;

@Service("StudentScoreViewService")
@Transactional
public class StudentScoreViewServiceimpl implements StudentScoreViewService {
	@Autowired
	private StudentScoreViewDao studentscoreview;
	@Override
	public List<StudentScoreView> getAll() {
		
		return studentscoreview.finAll();
	}

	@Override
	public List<StudentScoreView> getByTeaId(long teaId) {
		// TODO Auto-generated method stub
		return studentscoreview.queryByTeaId(teaId);
	}

	@Override
	public List<StudentScoreView> getByteaIdCourseId(long teaId, long courseId) {
		// TODO Auto-generated method stub
		return studentscoreview.queryByTeaIdCourseId(teaId, courseId);
	}

	@Override
	public List<StudentScoreView> getByStuId(long stuId) {
		// TODO Auto-generated method stub
		return studentscoreview.queryById(stuId);
	}

	@Override
	public StudentScoreView getByStuIdCourseId(long stuId, long courseId) {
		// TODO Auto-generated method stub
		return studentscoreview.queryByStuIdCourseId(stuId, courseId);
	}

}
