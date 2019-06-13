/**
 * 
 */
package com.dc.lwm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dc.lwm.dao.ClassDao;
import com.dc.lwm.entity.Class;
import com.dc.lwm.service.ClassService;

/**
 * @author 鏉庡穽宀�
   @date	2019骞�6鏈�5鏃�
 *
 * 
 */
@Service("ClassService")
@Transactional
public class ClassServiceimpl implements ClassService {
	@Autowired
	private ClassDao classDao;
	/* (non-Javadoc)
	 * @see com.dc.lwm.service.ClassService#getAllClass()
	 */
	public List<Class> getAllClass() {
		// TODO Auto-generated method stub
		return classDao.findAllClass();
	}

	/* (non-Javadoc)
	 * @see com.dc.lwm.service.ClassService#addClass(com.dc.lwm.entity.Class)
	 */
	public int addClass(Class class1) {
		// TODO Auto-generated method stub
		return classDao.insertClass(class1);
	}

	/* (non-Javadoc)
	 * @see com.dc.lwm.service.ClassService#updateClass(com.dc.lwm.entity.Class)
	 */
	public int updateClass(Class class1) {
		// TODO Auto-generated method stub
		return classDao.modifyClass(class1);
	}

	/* (non-Javadoc)
	 * @see com.dc.lwm.service.ClassService#getByClassId(long)
	 */
	public Class getByClassId(long classId) {
		// TODO Auto-generated method stub
		return classDao.queryById(classId);
	}

	/* (non-Javadoc)
	 * @see com.dc.lwm.service.ClassService#getByClassName(java.lang.String)
	 */
	public Class getByClassName(String className) {
		// TODO Auto-generated method stub
		return classDao.queryByName(className);
	}

	/* (non-Javadoc)
	 * @see com.dc.lwm.service.ClassService#delete(long)
	 */
	public int delete(long classId) {
		// TODO Auto-generated method stub
		return classDao.deleteById(classId);
	}

}
