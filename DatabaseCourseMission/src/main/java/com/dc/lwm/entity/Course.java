package com.dc.lwm.entity;

public class Course {
	private long courseId;
	private String courseName;
	private int capacity;
	private int xuefen;
	private String courseTime;
	private String coursePlace;

	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getXuefen() {
		return xuefen;
	}

	public void setXuefen(int xuefen) {
		this.xuefen = xuefen;
	}

	public String getCourseTime() {
		return courseTime;
	}

	public void setCourseTime(String courseTime) {
		this.courseTime = courseTime;
	}

	public String getCoursePlace() {
		return coursePlace;
	}

	public void setCoursePlace(String coursePlace) {
		this.coursePlace = coursePlace;
	}

	public Course(long courseId, String courseName, int capacity, int xuefen, String courseTime, String coursePlace) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.capacity = capacity;
		this.xuefen = xuefen;
		this.courseTime = courseTime;
		this.coursePlace = coursePlace;
	}

	public Course() {
		super();
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", capacity=" + capacity + ", xuefen="
				+ xuefen + ", courseTime=" + courseTime + ", coursePlace=" + coursePlace + "]";
	}

}
