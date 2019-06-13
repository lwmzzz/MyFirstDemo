package com.dc.lwm.entity;

public class StudentState {
	private long stuId;
	private String stuState;

	public long getStuId() {
		return stuId;
	}

	public void setStuId(long stuId) {
		this.stuId = stuId;
	}

	public String getStuState() {
		return stuState;
	}

	public void setStuState(String stuState) {
		this.stuState = stuState;
	}

	public StudentState(long stuId, String stuState) {
		super();
		this.stuId = stuId;
		this.stuState = stuState;
	}

	public StudentState() {
		super();
	}

	@Override
	public String toString() {
		return "StudentState [stuId=" + stuId + ", stuState=" + stuState + "]";
	}

}
