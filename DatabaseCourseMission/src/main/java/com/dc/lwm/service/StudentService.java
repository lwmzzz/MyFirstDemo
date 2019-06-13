/**
 * 
 */
package com.dc.lwm.service;

import java.util.List;

import com.dc.lwm.entity.StuTimeTbale;
import com.dc.lwm.entity.Student;
import com.github.pagehelper.PageInfo;

/**
 * @author 李巍岷
   @date	2019年6月2日
 *
 * 
 */
public interface StudentService {
	public Student getById(long stuId);
	public List<Student> getAllStudents();
	public List<Student> getStudentsByMajor(long majorId);
	public List<Student> getStudentsByClass(long classId);
	public int updateById(Student stu);
	public int addStudent(Student stu);
	public int fireStudent(long stuId);
	public List<StuTimeTbale> getScoreById(long stuId);
	public int ChangeStudentState(long stuId,String state);
	public PageInfo<Student> getAllPage();
 
}
