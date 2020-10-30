package com.cg.studentapp.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.cg.studentapp.exception.StudentNotFoundException;
import com.cg.studentapp.model.Student;

public class StudentRepoImpl implements IStudentRepo{
	Connection con;
	PreparedStatement psmt;
	ResultSet rsStudent;

	public StudentRepoImpl() {
		try {
			con=ConnectionUtil.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public Student addStudent(Student student) throws SQLException {
		
		psmt=con.prepareStatement("insert into student values(?,?,?,?)");
		psmt.setString(1, student.getStudentId());
		psmt.setString(2, student.getStudentName());
		psmt.setFloat(3, student.getMarks());
		psmt.setLong(4, student.getPhoneNo());
		psmt.executeUpdate();
		return student;
	}
	
	@Override
	public Student getStudentById(String studentId) throws SQLException {
		psmt=con.prepareStatement("select * from student where id=?");
		psmt.setString(1, studentId);
		rsStudent=psmt.executeQuery();
		if(!rsStudent.next()) {
			throw new StudentNotFoundException("Student with ID ["+studentId+"] does not exist");
		}
		Student student=new Student();
		student.setStudentId(rsStudent.getString("id"));
		student.setStudentName(rsStudent.getString("sname"));
		student.setMarks(rsStudent.getFloat("marks"));
		student.setPhoneNo(rsStudent.getLong("phone_no"));
		return student;
	}
	
	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean deleteStudent(String studentId) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}
}
