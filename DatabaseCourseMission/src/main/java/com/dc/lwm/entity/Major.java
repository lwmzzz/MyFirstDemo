package com.dc.lwm.entity;

public class Major {
	private long majorId;
	private String majorName;
	private String xueyaunName;

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

	public String getXueyaunName() {
		return xueyaunName;
	}

	public void setXueyaunName(String xueyaunName) {
		this.xueyaunName = xueyaunName;
	}

	public Major(long majorId, String majorName, String xueyaunName) {
		super();
		this.majorId = majorId;
		this.majorName = majorName;
		this.xueyaunName = xueyaunName;
	}

	public Major() {
		super();
	}

	@Override
	public String toString() {
		return "Major [majorId=" + majorId + ", majorName=" + majorName + ", xueyaunName=" + xueyaunName + "]";
	}

}
