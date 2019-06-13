package com.dc.lwm.entity;

public class StudentStateView {
	private long stuId;
	private String majorName;
	private String className;
	private String stuName;
	private String stuState;

	public long getStuId() {
		return stuId;
	}

	public void setStuId(long stuId) {
		this.stuId = stuId;
	}

	public String getMajorName() {
		return majorName;
	}

	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuState() {
		return stuState;
	}

	public void setStuState(String stuState) {
		this.stuState = stuState;
	}

	public StudentStateView(long stuId, String majorName, String className, String stuName, String stuState) {
		super();
		this.stuId = stuId;
		this.majorName = majorName;
		this.className = className;
		this.stuName = stuName;
		this.stuState = stuState;
	}

	public StudentStateView() {
		super();
	}

	@Override
	public String toString() {
		return "StudentStateView [stuId=" + stuId + ", majorName=" + majorName + ", className=" + className
				+ ", stuName=" + stuName + ", stuState=" + stuState + "]";
	}

}
