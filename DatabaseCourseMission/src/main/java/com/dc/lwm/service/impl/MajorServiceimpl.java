/**
 * 
 */
package com.dc.lwm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dc.lwm.dao.MajorDao;
import com.dc.lwm.entity.Major;
import com.dc.lwm.service.MajorService;

/**
 * @author 鏉庡穽宀�
 * @date 2019骞�6鏈�5鏃�
 *
 * 
 */
@Service("MajorService")
@Transactional
public class MajorServiceimpl implements MajorService {
	@Autowired
	private MajorDao majorDao;
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.dc.lwm.service.MajorService#getById(long)
	 */
	public Major getById(long majorId) {
		// TODO Auto-generated method stub
		return majorDao.queryById(majorId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.dc.lwm.service.MajorService#delete(long)
	 */
	public int delete(long najorId) {
		// TODO Auto-generated method stub
		return majorDao.deleteById(najorId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.dc.lwm.service.MajorService#updateMajor(com.dc.lwm.entity.Major)
	 */
	public int updateMajor(Major major) {
		// TODO Auto-generated method stub
		return majorDao.modifyById(major);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.dc.lwm.service.MajorService#getByName(java.lang.String)
	 */
	public Major getByName(String majorName) {
		// TODO Auto-generated method stub
		return majorDao.queryByName(majorName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.dc.lwm.service.MajorService#addMajor(com.dc.lwm.entity.Major)
	 */
	public int addMajor(Major major) {
		// TODO Auto-generated method stub
		return majorDao.insertMajor(major);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.dc.lwm.service.MajorService#getAllMajor()
	 */
	public List<Major> getAllMajor() {
		// TODO Auto-generated method stub
		return majorDao.findAllMajor();
	}

}
