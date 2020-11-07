package com.cg.studentapp.model;

import java.io.Serializable;

public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2346466766452139177L;
	private String studentId;
	private String studentName;
	private float marks;
	private long phoneNo;
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Student(String studentId, String studentName, float marks, long phoneNo) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
		this.phoneNo = phoneNo;
	}



	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", marks=" + marks + ", phoneNo="
				+ phoneNo + "]";
	}
	
	
	
}
