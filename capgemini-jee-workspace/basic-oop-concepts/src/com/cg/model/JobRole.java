package com.cg.model;

public enum JobRole {

	DEVELOPER(10), MANAGER(20), ANALYST(30), QA_ENGINEER(40);
	public int value;
	JobRole(int  value){
		this.value=value;
	}
	
}
