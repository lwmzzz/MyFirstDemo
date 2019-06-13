/**
 * 
 */
package com.dc.lwm.dao;

import java.util.List;

import com.dc.lwm.entity.Course;

/**
 * @author 李巍岷
 * @date 2019年6月1日
 *
 * 
 */
public interface CourseDao {
	public List<Course> findAllCourse();

	public Course queryById(long courseId);

	public int modifyCourse(Course course);

	public int deleteCourse(long courseId);

	public int insertCourse(Course course);
}
