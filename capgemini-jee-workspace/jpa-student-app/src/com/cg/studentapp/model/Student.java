package com.cg.studentapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_data")
public class Student {

	@Id
	private int studentId;
	@Column(length = 30)
	private String studentName;
	@Column(name = "student_age" , nullable = false)
	private int age;
	@Column(nullable = true)
	private float marks;
	
	public Student() {
	}

	public Student(int studentId, String studentName, int age, float marks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.age = age;
		this.marks = marks;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", age=" + age + ", marks=" + marks
				+ "]";
	}
	
	
	
	
	
	
}
