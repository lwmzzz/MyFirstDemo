/**
 * 
 */
package com.dc.lwm.service;

import java.util.List;

import com.dc.lwm.entity.Major;

/**
 * @author 李巍岷
   @date	2019年6月5日
 *
 * 
 */
public interface MajorService {
	public Major getById(long majorId);

	public int delete(long najorId);

	public int updateMajor(Major major);

	public Major getByName(String majorName);

	public int addMajor(Major major);

	public List<Major> getAllMajor();
}

