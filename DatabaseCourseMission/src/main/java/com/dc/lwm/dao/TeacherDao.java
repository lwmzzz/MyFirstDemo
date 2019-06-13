/**
 * 
 */
package com.dc.lwm.dao;

import java.util.List;

import com.dc.lwm.entity.Teacher;

/**
 * @author 李巍岷
 * @date 2019年6月1日
 *
 * 
 */
public interface TeacherDao {
	public int insertTeacher(Teacher teacher);

	public int deleteById(long teaId);

	public List<Teacher> queryByMajor(long majorId);

	public Teacher queryById(long teaId);

	public int modifyById(Teacher teacher);

	public List<Teacher> findAllTeacher();
}
