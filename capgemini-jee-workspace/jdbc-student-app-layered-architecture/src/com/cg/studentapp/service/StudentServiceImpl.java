package com.cg.studentapp.service;

import java.sql.SQLException;
import java.util.List;

import com.cg.studentapp.exception.InvalidMarksException;
import com.cg.studentapp.model.Student;
import com.cg.studentapp.repository.IStudentRepo;
import com.cg.studentapp.repository.StudentRepoImpl;

public class StudentServiceImpl implements IStudentService{

	IStudentRepo repo=new StudentRepoImpl();
	
	@Override
	public Student addStudent(Student student) throws SQLException {
		if(student.getMarks()>100 || student.getMarks()<0) {
			throw new InvalidMarksException("Invalid Marks - "+student.getMarks());
		}
		return repo.addStudent(student);
	}

	@Override
	public Student getStudent(String studentId) throws SQLException {
		
		return repo.getStudentById(studentId);
	}

	@Override
	public Student updateStudent(Student student) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteStudent(String studentId) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Student> getAllStudents() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
