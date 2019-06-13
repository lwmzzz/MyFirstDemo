package com.dc.lwm.entity;

import java.util.Date;

public class TeacherInfoView {
	private long teaId;
	private String teaName;
	private String gender;
	private String nation;
	private String majorName;
	private Date workDay;
	private String laojia;
	public TeacherInfoView() {
		super();
	}
	public long getTeaId() {
		return teaId;
	}
	public void setTeaId(long teaId) {
		this.teaId = teaId;
	}
	public String getTeaName() {
		return teaName;
	}
	public void setTeaName(String teaName) {
		this.teaName = teaName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getMajorName() {
		return majorName;
	}
	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}
	public Date getWorkDay() {
		return workDay;
	}
	public void setWorkDay(Date workDay) {
		this.workDay = workDay;
	}
	public String getLaojia() {
		return laojia;
	}
	public void setLaojia(String laojia) {
		this.laojia = laojia;
	}
	public TeacherInfoView(long teaId, String teaName, String gender, String nation, String majorName, Date workDay,
			String laojia) {
		super();
		this.teaId = teaId;
		this.teaName = teaName;
		this.gender = gender;
		this.nation = nation;
		this.majorName = majorName;
		this.workDay = workDay;
		this.laojia = laojia;
	}
	@Override
	public String toString() {
		return "TeacherInfoView [teaId=" + teaId + ", teaName=" + teaName + ", gender=" + gender + ", nation=" + nation
				+ ", majorName=" + majorName + ", workDay=" + workDay + ", laojia=" + laojia + "]";
	}
	
}
