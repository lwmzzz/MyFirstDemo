package com.dc.lwm.entity;

import java.io.Serializable;
import java.util.Date;

//@Table("student")
public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long stuId;
	private String gender;
	private long idCode;
	private String stuName;
	private long classId;
	private Date birthday;
	private String nation;
	private String laojia;
	private String stuAddress;
	private long majorId;

	public long getStuId() {
		return stuId;
	}

	public void setStuId(long stuId) {
		this.stuId = stuId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getIdCode() {
		return idCode;
	}

	public void setIdCode(long idCode) {
		this.idCode = idCode;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public long getClassId() {
		return classId;
	}

	public void setClassId(long classId) {
		this.classId = classId;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getLaojia() {
		return laojia;
	}

	public void setLaojia(String laojia) {
		this.laojia = laojia;
	}

	public String getStuAddress() {
		return stuAddress;
	}

	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}

	public long getMajorId() {
		return majorId;
	}

	public void setMajorId(long majorId) {
		this.majorId = majorId;
	}

	public Student(long stuId, String gender, long idCode, String stuName, long classId, Date birthday, String nation,
			String laojia, String stuAddress, long majorId) {
		super();
		this.stuId = stuId;
		this.gender = gender;
		this.idCode = idCode;
		this.stuName = stuName;
		this.classId = classId;
		this.birthday = birthday;
		this.nation = nation;
		this.laojia = laojia;
		this.stuAddress = stuAddress;
		this.majorId = majorId;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", gender=" + gender + ", idCode=" + idCode + ", stuName=" + stuName
				+ ", classId=" + classId + ", birthday=" + birthday + ", nation=" + nation + ", laojia=" + laojia
				+ ", stuAddress=" + stuAddress + ", majorId=" + majorId + "]";
	}

}
