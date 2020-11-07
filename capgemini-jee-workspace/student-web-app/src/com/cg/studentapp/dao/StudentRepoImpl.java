package com.cg.studentapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cg.studentapp.exception.StudentNotFoundException;
import com.cg.studentapp.model.Student;

public class StudentRepoImpl implements IStudentRepo{
	PreparedStatement psmt;
	ResultSet studentResultSet;
	Connection connection;

	public StudentRepoImpl() throws SQLException {
		connection=DBUtil.createConnection();
	}
	
	@Override
	public Student addStudent(Student student) throws SQLException {
		
		psmt=connection.prepareStatement("insert into student values(?,?,?,?)");
		psmt.setString(1, student.getStudentId());
		psmt.setString(2, student.getStudentName());
		psmt.setFloat(3, student.getMarks());
		psmt.setLong(4, student.getPhoneNo());
		
		int count=psmt.executeUpdate();
		return student;
		
	}

	@Override
	public Student getStudentById(String studentId) throws SQLException {
		psmt=connection.prepareStatement("select * from student where id=?");
		psmt.setString(1, studentId);
		studentResultSet=psmt.executeQuery();
		if(!studentResultSet.next()) {
			throw new StudentNotFoundException("Student with ID ["+studentId+"] does not exist");
		}
		Student student=new Student();
		student.setStudentId(studentResultSet.getString("id"));
		student.setStudentName(studentResultSet.getString("sname"));
		student.setMarks(studentResultSet.getFloat("marks"));
		student.setPhoneNo(studentResultSet.getLong("phone_no"));
		return student;
	}

	@Override
	public List<Student> getAllStudent() throws SQLException {
		
	psmt=connection.prepareStatement("select * from student");
		
		studentResultSet=psmt.executeQuery();
		
		List<Student> students=new ArrayList<>();
		while(studentResultSet.next()) {
		Student student=new Student();
		student.setStudentId(studentResultSet.getString("id"));
		student.setStudentName(studentResultSet.getString("sname"));
		student.setMarks(studentResultSet.getFloat("marks"));
		student.setPhoneNo(studentResultSet.getLong("phone_no"));
		students.add(student);
	}
		return students;
	}

	@Override
	public boolean deleteStudent(String studentId) throws SQLException {
		Student oldStudent=getStudentById(studentId);
		psmt=connection.prepareStatement("delete from student where id=?");
		psmt.setString(1, studentId);
		int deleted=psmt.executeUpdate();
		return deleted>0;
	}
	
	
}
