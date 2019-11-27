package com.app;

public class Project {
	private String pname;
	private Version v;
	public Project() {
		super();
	}
	@Override
	public String toString() {
		return "Project [pname=" + pname + ", v=" + v + "]";
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Version getV() {
		return v;
	}
	public void setV(Version v) {
		this.v = v;
	}
	

}
