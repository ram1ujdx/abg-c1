package com.cg.model;



public class Trainee {

	public static String companyName;
	
	private String traineeName;
	private int age;
	private String email;
	private JobRole jobRole;
	
	public Trainee() {
	}
	
	
	
	public Trainee(String traineeName, int age, String email) {
	
		this.traineeName = traineeName;
		this.age = age;
		this.email = email;
	}



	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	public JobRole getJobRole() {
		return jobRole;
	}



	public void setJobRole(JobRole jobRole) {
		this.jobRole = jobRole;
	}



	public void showTrainee() {
		System.out.println("Company Name = "+companyName);
		System.out.println("Name = "+traineeName);
		System.out.println("Age = "+age);
		System.out.println("Email = "+email);
		System.out.println("Profile = "+jobRole);
	}
	
   public static void fun() {
	   System.out.println("Hello");
   }
   
   protected void finalize() throws Throwable {
	System.out.println("Trainee Removed from Memory");
	super.finalize();
}
	
	
	
}
