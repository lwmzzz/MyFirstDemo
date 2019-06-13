package com.dc.lwm.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dc.lwm.entity.StudentInfoView;
import com.dc.lwm.service.StudentInfoViewService;

@Service("StudentInfoViewService")
@Transactional
public class StudentInfoViewServiceimpl implements StudentInfoViewService {

	@Override
	public List<StudentInfoView> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentInfoView getById(long stuId) {
		// TODO Auto-generated method stub
		return null;
	}

}
