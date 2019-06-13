/**
 * 
 */
package com.dc.lwm.service;

import java.util.List;

import com.dc.lwm.entity.Teacher;

/**
 * @author 李巍岷
   @date	2019年6月5日
 *
 * 
 */
public interface TeacherService {
	public int addTeacher(Teacher teacher);

	public int delete(long teaId);

	public List<Teacher> getByMajor(long majorId);

	public Teacher getById(long teaId);

	public int updateTeacher(Teacher teacher);

	public List<Teacher> getAllTeacher();
}
