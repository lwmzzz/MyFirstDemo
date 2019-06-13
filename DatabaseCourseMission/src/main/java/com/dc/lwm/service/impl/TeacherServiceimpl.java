/**
 * 
 */
package com.dc.lwm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dc.lwm.dao.TeacherDao;
import com.dc.lwm.entity.Teacher;
import com.dc.lwm.service.TeacherService;

/**
 * @author  lwmzzz
   @date	2019年�6月5号
 *
 * 
 */
@Service("TeacherService")
@Transactional
public class TeacherServiceimpl implements TeacherService {
@Autowired
private TeacherDao teacherDao;
	/* (non-Javadoc)
	 * @see com.dc.lwm.service.TeacherService#addTeacher(com.dc.lwm.entity.Teacher)
	 */
	public int addTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherDao.insertTeacher(teacher);
	}

	/* (non-Javadoc)
	 * @see com.dc.lwm.service.TeacherService#delete(long)
	 */
	public int delete(long teaId) {
		// TODO Auto-generated method stub
		return teacherDao.deleteById(teaId);
	}

	/* (non-Javadoc)
	 * @see com.dc.lwm.service.TeacherService#getByMajor(long)
	 */
	public List<Teacher> getByMajor(long majorId) {
		// TODO Auto-generated method stub
		return teacherDao.queryByMajor(majorId);
	}

	/* (non-Javadoc)
	 * @see com.dc.lwm.service.TeacherService#getById(long)
	 */
	public Teacher getById(long teaId) {
		// TODO Auto-generated method stub
		return teacherDao.queryById(teaId);
	}

	/* (non-Javadoc)
	 * @see com.dc.lwm.service.TeacherService#updateTeacher(com.dc.lwm.entity.Teacher)
	 */
	public int updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherDao.modifyById(teacher);
	}

	/* (non-Javadoc)
	 * @see com.dc.lwm.service.TeacherService#getAllTeacher()
	 */
	public List<Teacher> getAllTeacher() {
		// TODO Auto-generated method stub
		return teacherDao.findAllTeacher();
	}

}
