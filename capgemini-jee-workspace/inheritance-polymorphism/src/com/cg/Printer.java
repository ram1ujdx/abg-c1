package com.cg;

public class Printer extends Machine {

	int inkLevel;
	
	@Override
	public void start() {
		System.out.println("Printer Started...");
	}
	
	public void print() {
		System.out.println("Printing Started...");
	}
	
	
	
}
