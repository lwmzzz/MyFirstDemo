package com.dc.lwm.entity;

public class StuTimeTbale {
	private long stuId;
	private long courseId;
	private long teaId;
	private int score;

	public long getStuId() {
		return stuId;
	}

	public void setStuId(long stuId) {
		this.stuId = stuId;
	}

	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public StuTimeTbale() {
		super();
	}

	public long getTeaId() {
		return teaId;
	}

	public void setTeaId(long teaId) {
		this.teaId = teaId;
	}

	@Override
	public String toString() {
		return "StuTimeTbale [stuId=" + stuId + ", courseId=" + courseId + ", teaId=" + teaId + ", score=" + score
				+ "]";
	}

	public StuTimeTbale(long stuId, long courseId, long teaId, int score) {
		super();
		this.stuId = stuId;
		this.courseId = courseId;
		this.teaId = teaId;
		this.score = score;
	}

}
