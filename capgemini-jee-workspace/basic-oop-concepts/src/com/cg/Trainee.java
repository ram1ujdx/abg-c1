package com.cg;

public class Trainee {

	private String traineeName;
	private int age;
	private String email;
	
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
	
	
	
	
	
	public void showTrainee() {
		System.out.println("Name = "+traineeName);
		System.out.println("Age = "+age);
		System.out.println("Email = "+email);
	}
	
	
	
}
