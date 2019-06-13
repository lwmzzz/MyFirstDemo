package com.dc.lwm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dc.lwm.dao.TeacherInfoViewDao;
import com.dc.lwm.entity.TeacherInfoView;
import com.dc.lwm.service.TeacherInfoViewService;

@Service("TeacherInfoViewService")
@Transactional
public class TeacherInfoViewServiceimpl implements TeacherInfoViewService {
	@Autowired
	private TeacherInfoViewDao tivd;

	@Override
	public List<TeacherInfoView> getAll() {
		// TODO Auto-generated method stub
		return tivd.findAll();
	}

	@Override
	public TeacherInfoView getById(long teaId) {
		// TODO Auto-generated method stub
		return tivd.queryById(teaId);
	}

}
