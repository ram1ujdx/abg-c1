package com.cg;

public abstract class Machine {
	
	protected String brand;
	double inputVotage;
	
	public abstract void start();
	
	public void stop() {
		System.out.println("Shutting Down...");
	}
	public void print() {
		System.out.println("Not Supported");
	}
	public void scan() {
		System.out.println("Not Supported");
	}

}
