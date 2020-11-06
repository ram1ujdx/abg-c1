package com.cg.studentapp.model;

public class Student {
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
