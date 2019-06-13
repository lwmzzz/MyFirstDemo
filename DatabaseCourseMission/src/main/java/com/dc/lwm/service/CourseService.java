/**
 * 
 */
package com.dc.lwm.service;

import java.util.List;

import com.dc.lwm.entity.Course;

/**
 * @author 李巍岷
   @date	2019年6月5日
 *
 * 
 */
public interface CourseService {
	public List<Course> getAllCourse();

	public Course getByCourseId(long courseId);

	public int updateCourse(Course course);

	public int delete(long courseId);

	public int addCourse(Course course);
}
