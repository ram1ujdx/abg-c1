package com.cg.studentapp.dao;

import java.sql.SQLException;
import java.util.List;

import com.cg.studentapp.model.Student;

public interface IStudentRepo {

	Student addStudent(Student student) throws SQLException;
	Student getStudentById(String studentId) throws SQLException;
	List<Student> getAllStudent() throws SQLException;
	
	
	
	
}
