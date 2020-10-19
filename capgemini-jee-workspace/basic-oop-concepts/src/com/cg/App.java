package com.cg;
import java.util.Date;

import com.cg.model.JobRole;
import com.cg.model.Trainee;
import static com.cg.model.Trainee.*;

public class App {

	
	public static void main(String[] args) {
		
		Date today=new Date();
		System.out.println("Current System Date : ");
		System.out.println(today);
		
		companyName="Capgemini";
		fun();
		
		Trainee t1=new Trainee("Priya Roy",23,"priya@gmail.com");
		Trainee t2=new Trainee("Gaurav Sharma",28,"gaurav@gmail.com");
		
		
		t1.setEmail("rahul@gmail.com");
		t1.setTraineeName("Rahul Reddy");
		t1.setJobRole(JobRole.DEVELOPER);
		Trainee.companyName="CTS";
		t2.setJobRole(JobRole.MANAGER);
		t1.showTrainee();
		

		t2.showTrainee();
		System.out.println(t2.getJobRole().value);
//		
		t1=t2;
//		t2=null;
		
		//
		//
		//////////////////
		
		System.gc();
	
		

	}

}
