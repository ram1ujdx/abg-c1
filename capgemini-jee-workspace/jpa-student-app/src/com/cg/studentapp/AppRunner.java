package com.cg.studentapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.studentapp.model.Student;

public class AppRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("capg-student-app");
		EntityManager emgr=factory.createEntityManager();
		EntityTransaction transaction=emgr.getTransaction();

// 		Inserting Student		
		
//		Student student1=new Student(1002, "Praveen", 22, 92);
//		Student student2=new Student(1003, "Vargav", 21, 93);
//		transaction.begin();
//		emgr.persist(student1);
//		emgr.persist(student2);
//		transaction.commit();
		
		
//		Finding a Student
//		
//		Student student=emgr.find(Student.class,1002);
//		System.out.println(student);
		
//		Delete a Student
		
//		Student student=emgr.find(Student.class,1002);
//		transaction.begin();
//		emgr.remove(student);
//		transaction.commit();
		
//		Update a Student - Method 1
		
//		Student student=emgr.find(Student.class,1001);
//		student.setMarks(90);
//		transaction.begin();
//		emgr.persist(student);
//		transaction.commit();
	
//		Update a Student - Method 2		
//		Student student=new Student(1004, "Shreya", 22, 94);
//		transaction.begin();
//		emgr.merge(student);
//		transaction.commit();
		

	}

}
