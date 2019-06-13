package com.dc.lwm.entity;

public class Class {
	private long majorId;
	private long classId;
	private String className;
	private long banzhurenId;

	public long getMajorId() {
		return majorId;
	}

	public void setMajorId(long majorId) {
		this.majorId = majorId;
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

	public long getBanzhurenId() {
		return banzhurenId;
	}

	public void setBanzhurenId(long banzhurenId) {
		this.banzhurenId = banzhurenId;
	}

	public Class(long majorId, long classId, String className, long banzhurenId) {
		super();
		this.majorId = majorId;
		this.classId = classId;
		this.className = className;
		this.banzhurenId = banzhurenId;
	}

	public Class() {
		super();
	}

	@Override
	public String toString() {
		return "Class [majorId=" + majorId + ", classId=" + classId + ", className=" + className + ", banzhurenId="
				+ banzhurenId + "]";
	}

}
