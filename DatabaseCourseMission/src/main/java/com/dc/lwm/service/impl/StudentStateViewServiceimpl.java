package com.dc.lwm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dc.lwm.dao.StudentStateViewDao;
import com.dc.lwm.entity.StudentStateView;
import com.dc.lwm.service.StudentStateViewService;
@Service("StudentStateViewService")
@Transactional
public class StudentStateViewServiceimpl implements StudentStateViewService {
	@Autowired
	private StudentStateViewDao studentstateDao;
	@Override
	public List<StudentStateView> getAll() {
		// TODO Auto-generated method stub
		return studentstateDao.findAll();
	}

	@Override
	public StudentStateView getById(long stuId) {
		// TODO Auto-generated method stub
		return studentstateDao.queryById(stuId);
	}

}
