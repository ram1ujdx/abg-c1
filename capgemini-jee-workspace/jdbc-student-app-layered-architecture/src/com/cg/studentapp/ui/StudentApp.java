package com.cg.studentapp.ui;

import java.sql.SQLException;

import com.cg.studentapp.exception.InvalidMarksException;
import com.cg.studentapp.exception.StudentNotFoundException;
import com.cg.studentapp.model.Student;
import com.cg.studentapp.service.IStudentService;
import com.cg.studentapp.service.StudentServiceImpl;

public class StudentApp {

	public static void main(String[] args) {
		
		IStudentService service=new StudentServiceImpl();
		
		Student student=new Student("s1028", "Rohit Sharma", 88.35F, 8764164765L);
		
		try {
//			Student savedStudent=service.addStudent(student);
//			System.out.println(savedStudent);
			
//			Student updatedStudent=service.updateStudent(student);
			boolean deleted=service.deleteStudent("s1523");
			if(deleted) {
				System.out.println("Deleted Successfully");
			}
			
			service.getAllStudents().forEach(std->System.out.println(std));
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		catch (InvalidMarksException e) {
			System.err.println(e.getMessage());
		}
		catch (StudentNotFoundException e) {
			System.err.println(e.getMessage());
		}
		

	}

}
