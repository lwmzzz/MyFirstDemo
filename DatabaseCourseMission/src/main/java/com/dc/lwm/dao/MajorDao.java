package com.dc.lwm.dao;

import java.util.List;

import com.dc.lwm.entity.Major;

public interface MajorDao {
	public Major queryById(long majorId);

	public int deleteById(long najorId);

	public int modifyById(Major major);

	public Major queryByName(String majorName);

	public int insertMajor(Major major);

	public List<Major> findAllMajor();
}
