package edu201905.spring.domain;

public class DeptInfo {
	//部门编号
	private Integer deptno;

	private String dname;

	private String loc;

	@Override
	public String toString() {
		return "DeptInfo [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}

	public Integer getDeptno() {
		return deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
}
