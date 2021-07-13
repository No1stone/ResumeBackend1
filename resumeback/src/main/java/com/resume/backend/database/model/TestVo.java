package com.resume.backend.database.model;

public class TestVo {

	private String id;
	private String pw;
	public TestVo() {}
	public TestVo(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "TestVo [id=" + id + ", pw=" + pw + ", getId()=" + getId() + ", getPw()=" + getPw() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
