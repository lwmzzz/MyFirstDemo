package com.dc.lwm.dao;

import java.util.List;
import java.util.Map;

import com.dc.lwm.entity.Student;

public interface StudentDao {
	/**
	 * 添加学生
	 * 
	 * @param student 学生信息
	 * @return 插入结果 !=0则插入成功
	 */
	public int insertStudent(Student student);

	/**
	 * 根据学号删除学生信息
	 * 
	 * @param stuId 学号
	 * @return 删除结果，!=0则删除成功
	 */
	public int deleteStudent(long stuId);

	/**
	 * 修改学生信息
	 * 
	 * @param student 学生信息
	 * @return 修改结果 !=0则修改成功
	 */
	public int modifyStudent(Student student);

	/**
	 * 查询全部学生，接住sql语句进行分页
	 * 
	 * @param data
	 * @return 查询结果
	 */
	public List<Student> queryStudentBySql(Map<String, Object> data);

	/**
	 * 根据学号，查询学生
	 * 
	 * @param stuId
	 * @return 查询结果
	 */
	public Student queryByStuId(long stuId);

	/**
	 * 使用Ajax查询学生是否存在
	 * 
	 * @param stuId
	 * @return 查询结果
	 */
	public String ajaxQueryBySid(long stuId);

	public List<Student> queryByClass(long classId);

	public List<Student> queryByMajor(long majorId);

	public List<Student> findAllStudents();
}
