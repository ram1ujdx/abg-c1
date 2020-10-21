package com.cg;

public abstract class Machine {
	
	public Machine(int x) {
		System.out.println("Manchine Initialized... "+x);
	}
	
	protected String brand;
	double inputVotage;
	
	public abstract void start();
	
	public final void stop() {
		System.out.println("Shutting Down...");
	}
	public void print() {
		System.out.println("Not Supported");
	}
	public void scan() {
		System.out.println("Not Supported");
	}

}
