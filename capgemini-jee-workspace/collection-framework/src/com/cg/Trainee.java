package com.cg;



public class Trainee implements Comparable<Trainee> {


	
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



	@Override
	public String toString() {
		return "Trainee [traineeName=" + traineeName + ", age=" + age + ", email=" + email + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((traineeName == null) ? 0 : traineeName.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trainee other = (Trainee) obj;
		if (age != other.age)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (traineeName == null) {
			if (other.traineeName != null)
				return false;
		} else if (!traineeName.equals(other.traineeName))
			return false;
		return true;
	}



	@Override
	public int compareTo(Trainee trainee) {
		return this.traineeName.compareTo(trainee.traineeName);
	}
	
	
 
	
	
	
}
