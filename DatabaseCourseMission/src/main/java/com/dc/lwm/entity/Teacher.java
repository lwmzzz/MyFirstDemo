package com.dc.lwm.entity;

import java.util.Date;

public class Teacher {
	private long teaId;
	private long majorId;
	private String gender;
	private long idcode;
	private String teaName;
	private Date birthday;
	private String nation;
	private String laojia;

	public long getTeaId() {
		return teaId;
	}

	public void setTeaId(long teaId) {
		this.teaId = teaId;
	}

	public long getMajorId() {
		return majorId;
	}

	public void setMajorId(long majorId) {
		this.majorId = majorId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getIdcode() {
		return idcode;
	}

	public void setIdcode(long idcode) {
		this.idcode = idcode;
	}

	public String getTeaName() {
		return teaName;
	}

	public void setTeaName(String teaName) {
		this.teaName = teaName;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
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

	public Teacher(long teaId, long majorId, String gender, long idcode, String teaName, Date birthday, String nation,
			String laojia) {
		super();
		this.teaId = teaId;
		this.majorId = majorId;
		this.gender = gender;
		this.idcode = idcode;
		this.teaName = teaName;
		this.birthday = birthday;
		this.nation = nation;
		this.laojia = laojia;
	}

	public Teacher() {
		super();
	}

	@Override
	public String toString() {
		return "Teacher [teaId=" + teaId + ", majorId=" + majorId + ", gender=" + gender + ", idcode=" + idcode
				+ ", teaName=" + teaName + ", birthday=" + birthday + ", nation=" + nation + ", laojia=" + laojia + "]";
	}

}
