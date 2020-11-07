package com.cg.studentapp.service;

import java.sql.SQLException;
import java.util.List;

import com.cg.studentapp.dao.IStudentRepo;
import com.cg.studentapp.dao.StudentRepoImpl;
import com.cg.studentapp.model.Student;



public class StudentServiceImpl implements IStudentService{

	IStudentRepo repo;
	
	public StudentServiceImpl() throws SQLException {
		repo=new StudentRepoImpl();
	}
	
	
	@Override
	public Student addStudent(Student student) throws SQLException {
		
		return repo.addStudent(student);
	}

	@Override
	public Student getStudent(String studentId) throws SQLException {
		
		return repo.getStudentById(studentId);
	}

	@Override
	public Student updateStudent(Student student) throws SQLException {
		return null;
	}

	@Override
	public boolean deleteStudent(String studentId) throws SQLException {
		return repo.deleteStudent(studentId);
	}

	@Override
	public List<Student> getAllStudents() throws SQLException {
		// TODO Auto-generated method stub
		return repo.getAllStudent();
	}

}
