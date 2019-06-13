/**
 * 
 */
package com.dc.lwm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dc.lwm.dao.CourseDao;
import com.dc.lwm.entity.Course;
import com.dc.lwm.service.CourseService;

/**
 * @author 李巍岷
 * @date 2019年6月5日
 *
 * 
 */
@Service("CourseService")
@Transactional
public class CourseServiceimpl implements CourseService {
	@Autowired
	private CourseDao courseDao;
	public List<Course> getAllCourse() {

		return courseDao.findAllCourse();
	}

	public Course getByCourseId(long courseId) {

		return null;
	}

	public int updateCourse(Course course) {
		return 0;
	}

	public int delete(long courseId) {
		return 0;
	}

	public int addCourse(Course course) {
		return 0;
	}

}
