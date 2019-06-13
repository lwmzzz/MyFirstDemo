/**
 * 
 */
package com.dc.lwm.service;

import java.util.List;

import com.dc.lwm.entity.Class;

/**
 * @author 李巍岷
   @date	2019年6月5日
 *
 * 
 */
public interface ClassService {
	public List<Class> getAllClass();
	public int addClass(Class class1);
	public int updateClass(Class class1);
	public Class getByClassId(long classId);
	public Class getByClassName(String className);
	public int delete(long classId);
}
