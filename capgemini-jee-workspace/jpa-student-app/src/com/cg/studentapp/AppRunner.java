package com.cg.studentapp;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.cg.studentapp.model.Student;

public class AppRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("capg-student-app");
		EntityManager emgr=factory.createEntityManager();
		EntityTransaction transaction=emgr.getTransaction();

// 		Inserting Student		
		
//		Student student1=new Student(1002, "Praveen", 22, 92); // New State
//		Student student2=new Student(1003, "Vargav", 21, 93);  // New State
//		transaction.begin();
//		emgr.persist(student1);
//		emgr.persist(student2);
//		student1.setMarks(88);
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
		
//		Student student=emgr.find(Student.class,1001); // Managed State
		
//		emgr.detach(student);
		
//		transaction.begin();
//		
//		student.setStudentName("Rahul Reddy");
//		
//		student.setMarks(100);
//		emgr.persist(student);
//		emgr.detach(student); //Detached State
//		transaction.commit();
		
	
//		Update a Student - Method 2		
//		Student student=new Student(1004, "Shreya", 22, 94);
//		transaction.begin();
//		emgr.merge(student);
//		transaction.commit();
		
		
// JPQL	
//		Query query1=emgr.createQuery("from Student");
//		int age;
//		System.out.println("Enter age : ");
//		age=new Scanner(System.in).nextInt();
//		TypedQuery<Student> tQuery1=emgr.createQuery("from Student where age>=:age", Student.class);
//		tQuery1.setParameter("age", age);
//		List<Student> studentList=tQuery1.getResultList();
//		studentList.forEach(System.out::println);
		
//		Query getByName=emgr.createNamedQuery("findByName");
//		getByName.setParameter("studentName", "Shreya");
//		Student student=(Student)getByName.getSingleResult();
//		System.out.println(student);
		
//		TypedQuery<Student> getByMarks=emgr.createNamedQuery("findByMarksRange",Student.class);
//		getByMarks.setParameter("minMarks", 94F);
//		getByMarks.setParameter("maxMarks", 100F);
//		List<Student> studentList=getByMarks.getResultList();
//		studentList.forEach(System.out::println);
		
		
		

	}

}
