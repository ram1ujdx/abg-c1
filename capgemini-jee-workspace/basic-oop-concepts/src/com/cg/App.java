package com.cg;

public class App {

	
	public static void main(String[] args) {
		
		
		Trainee t1=new Trainee("Priya Roy",23,"priya@gmail.com");
		Trainee t2=new Trainee("Gaurav Sharma",28,"gaurav@gmail.com");
		
		
		t1.setEmail("rahul@gmail.com");
		t1.setTraineeName("Rahul Reddy");
		t1.showTrainee();
		

		t2.showTrainee();
		
	
		

	}

}
