package edu201905.spring.domain;

import java.util.Date;

import edu201905.util.CommonUtils;

public class StudentInfo {
	private Integer sid;
	private String sname;
	private Integer sex;
	private String gender;
	private Date birth;
	private String loc;
	private String ethnic;

	@Override
	public String toString() {
		return "StudentInfo [sid=" + sid + ", sname=" + sname + ", sex=" + sex + ", birth=" + birth + ", loc=" + loc
				+ ", ethnic=" + ethnic + "]";
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
		this.gender = CommonUtils.sex2Gender(sex);
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getEthnic() {
		return ethnic;
	}

	public void setEthnic(String ethnic) {
		this.ethnic = ethnic;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
