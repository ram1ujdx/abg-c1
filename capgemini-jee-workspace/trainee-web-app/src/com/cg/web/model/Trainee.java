package com.cg.web.model;

public class Trainee {

	private String traineeName;
	private String email;
	private String gender;
	private String []languages;
	public Trainee() {
		// TODO Auto-generated constructor stub
	}
	public Trainee(String traineeName, String email, String gender, String[] languages) {
		super();
		this.traineeName = traineeName;
		this.email = email;
		this.gender = gender;
		this.languages = languages;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getLanguages() {
		return languages;
	}
	public void setLanguages(String[] languages) {
		this.languages = languages;
	}
	
}
