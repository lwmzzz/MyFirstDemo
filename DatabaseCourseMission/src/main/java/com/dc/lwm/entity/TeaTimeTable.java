package com.dc.lwm.entity;

public class TeaTimeTable {
	private long teaId;
	private long courseId;

	public long getTeaId() {
		return teaId;
	}

	public void setTeaId(long teaId) {
		this.teaId = teaId;
	}

	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	@Override
	public String toString() {
		return "TeaTimeTable [teaId=" + teaId + ", courseId=" + courseId + "]";
	}

	public TeaTimeTable(long teaId, long courseId) {
		super();
		this.teaId = teaId;
		this.courseId = courseId;
	}

	public TeaTimeTable() {
		super();
	}

}
