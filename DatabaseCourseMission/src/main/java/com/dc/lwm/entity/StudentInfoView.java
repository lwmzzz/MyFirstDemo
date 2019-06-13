package com.dc.lwm.entity;

import java.util.Date;

public class StudentInfoView {
	private long stuId;
	private String stuName;
	private long majorId;
	private String majorName;
	private long classId;
	private String className;
	private String stuGender;
	private Date shoolDay;
	private String nation;
	private String laojia;
	public long getStuId() {
		return stuId;
	}
	public void setStuId(long stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public long getMajorId() {
		return majorId;
	}
	public void setMajorId(long majorId) {
		this.majorId = majorId;
	}
	public String getMajorName() {
		return majorName;
	}
	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}
	public long getClassId() {
		return classId;
	}
	public void setClassId(long classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getStuGender() {
		return stuGender;
	}
	public void setStuGender(String stuGender) {
		this.stuGender = stuGender;
	}
	public Date getShoolDay() {
		return shoolDay;
	}
	public void setShoolDay(Date shoolDay) {
		this.shoolDay = shoolDay;
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
	@Override
	public String toString() {
		return "StudentInfoView [stuId=" + stuId + ", stuName=" + stuName + ", majorId=" + majorId + ", majorName="
				+ majorName + ", classId=" + classId + ", className=" + className + ", stuGender=" + stuGender
				+ ", shoolDay=" + shoolDay + ", nation=" + nation + ", laojia=" + laojia + "]";
	}
	public StudentInfoView(long stuId, String stuName, long majorId, String majorName, long classId, String className,
			String stuGender, Date shoolDay, String nation, String laojia) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.majorId = majorId;
		this.majorName = majorName;
		this.classId = classId;
		this.className = className;
		this.stuGender = stuGender;
		this.shoolDay = shoolDay;
		this.nation = nation;
		this.laojia = laojia;
	}
	public StudentInfoView() {
		super();
	}
	
}
