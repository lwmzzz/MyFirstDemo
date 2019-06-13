/**
 * 
 */
package com.dc.lwm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dc.lwm.dao.StudentDao;
import com.dc.lwm.dao.StudentStateDao;
import com.dc.lwm.entity.StuTimeTbale;
import com.dc.lwm.entity.Student;
import com.dc.lwm.service.StudentService;
import com.github.pagehelper.PageInfo;

/**
 * @author 鏉庡穽宀�
 * @date 2019骞�6鏈�11鏃�
 *
 * 
 */
@Service
public class StudentServiceimpl implements StudentService {
	@Autowired
	private StudentDao studentDao;
	@SuppressWarnings("unused")
	@Autowired
	private StudentStateDao studentStateDao;

	/* 
	 * 
	 * 
	 */
	@Override
	public Student getById(long stuId) {
		// TODO Auto-generated method stub
		return studentDao.queryByStuId(stuId);
	}

	/* 
	 * 
	 * 
	 */
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentDao.findAllStudents();
	}

	/* 
	 * 
	 * 
	 */
	@Override
	public List<Student> getStudentsByMajor(long majorId) {
		// TODO Auto-generated method stub
		return studentDao.queryByMajor(majorId);
	}

	/* 
	 * 
	 * 
	 */
	@Override
	public List<Student> getStudentsByClass(long classId) {
		// TODO Auto-generated method stub
		return studentDao.queryByClass(classId);
	}

	/* 
	 * 
	 * 
	 */
	@Override
	public int updateById(Student stu) {
		// TODO Auto-generated method stub
		return studentDao.modifyStudent(stu);
	}

	/* 
	 * 
	 * 
	 */
	@Override
	public int addStudent(Student stu) {
		// TODO Auto-generated method stub
		return studentDao.insertStudent(stu);
	}

	/* 
	 * 
	 * 
	 */
	@Override
	public int fireStudent(long stuId) {
		// TODO Auto-generated method stub
		return studentDao.deleteStudent(stuId);
	}

	/* 
	 * 
	 * 
	 */
	@Override
	public List<StuTimeTbale> getScoreById(long stuId) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * 
	 * 
	 */
	@Override
	public int ChangeStudentState(long stuId, String state) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* 
	 * 
	 * 
	 */
	@Override
	public PageInfo<Student> getAllPage() {
		PageInfo<Student> pageInfo = new PageInfo<Student>(studentDao.findAllStudents());
		// TODO Auto-generated method stub
		return pageInfo;
	}

}
