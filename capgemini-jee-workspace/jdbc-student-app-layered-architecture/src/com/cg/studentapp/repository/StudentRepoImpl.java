package com.cg.studentapp.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
	public Student updateStudent(Student student) throws SQLException {
		Student oldStudent=getStudentById(student.getStudentId());
		psmt=con.prepareStatement("update student set sname=?, marks=?, phone_no=? where id=?");
		psmt.setString(4, student.getStudentId());
		psmt.setString(1, student.getStudentName());
		psmt.setFloat(2, student.getMarks());
		psmt.setLong(3, student.getPhoneNo());
		psmt.executeUpdate();
		
		return student;
	}
	
	@Override
	public boolean deleteStudent(String studentId) throws SQLException {
		Student oldStudent=getStudentById(studentId);
		psmt=con.prepareStatement("delete from student where id=?");
		psmt.setString(1, studentId);
		int deleted=psmt.executeUpdate();
		return deleted>0;
	}
	
	@Override
	public List<Student> getAllStudents() throws SQLException {
		psmt=con.prepareStatement("select * from student");
		
		rsStudent=psmt.executeQuery();
		
		List<Student> students=new ArrayList<>();
		while(rsStudent.next()) {
		Student student=new Student();
		student.setStudentId(rsStudent.getString("id"));
		student.setStudentName(rsStudent.getString("sname"));
		student.setMarks(rsStudent.getFloat("marks"));
		student.setPhoneNo(rsStudent.getLong("phone_no"));
		students.add(student);
		}
		
		
		return students;
	}
}
