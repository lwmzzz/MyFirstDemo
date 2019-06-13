/**
 * 
 */
package com.dc.lwm.dao;

import java.util.List;

import com.dc.lwm.entity.StudentState;

/**
 * @author 李巍岷
 * @date 2019年6月1日
 *
 * 
 */
public interface StudentStateDao {
	public List<StudentState> findAllStudentState();

	public StudentState queryById(long stuId);

	public List<StudentState> queryByState(String state);

	public int modifyStudentState(StudentState state);
}
