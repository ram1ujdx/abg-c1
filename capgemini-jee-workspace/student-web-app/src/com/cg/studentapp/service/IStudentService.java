package com.cg.studentapp.service;

import java.sql.SQLException;
import java.util.List;

import com.cg.studentapp.model.Student;

public interface IStudentService {

public Student addStudent(Student student)throws SQLException;
	
	public Student getStudent(String studentId)throws SQLException;
	
	public Student updateStudent(Student student)throws SQLException;
	
	public boolean deleteStudent(String studentId)throws SQLException;
	
	public List<Student> getAllStudents()throws SQLException;
	
	
}
