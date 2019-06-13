/**
 * 
 */
package com.dc.lwm.dao;

import java.util.List;

import com.dc.lwm.entity.Class;

/**
 * @author 李巍岷
 * @date 2019年6月1日
 *
 * 
 */
public interface ClassDao {
	public Class queryById(long classId);

	public Class queryByName(String className);

	public List<Class> findAllClass();

	public int modifyClass(Class class1);

	public int insertClass(Class class1);

	public int deleteById(long classId);

}
