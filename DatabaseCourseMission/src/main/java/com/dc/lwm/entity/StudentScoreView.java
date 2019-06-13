package com.dc.lwm.entity;

public class StudentScoreView {
	private long stuId;
	private long teaId;
	private long courseId;
	private String className;
	private String majorName;
	private int score;
private String courseName;

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getMajorName() {
		return majorName;
	}

	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}

	private int stuScore;

	public long getStuId() {
		return stuId;
	}

	public void setStuId(long stuId) {
		this.stuId = stuId;
	}

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

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getStuScore() {
		return stuScore;
	}

	public void setStuScore(int stuScore) {
		this.stuScore = stuScore;
	}

	public StudentScoreView() {
		super();
	}

	@Override
	public String toString() {
		return "StudentScoreView [stuId=" + stuId + ", teaId=" + teaId + ", courseId=" + courseId + ", className="
				+ className + ", majorName=" + majorName + ", score=" + score + ", courseName=" + courseName
				+ ", stuScore=" + stuScore + "]";
	}

	public StudentScoreView(long stuId, long teaId, long courseId, String className, String majorName, int score,
			String courseName, int stuScore) {
		super();
		this.stuId = stuId;
		this.teaId = teaId;
		this.courseId = courseId;
		this.className = className;
		this.majorName = majorName;
		this.score = score;
		this.courseName = courseName;
		this.stuScore = stuScore;
	}

}
