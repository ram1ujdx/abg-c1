package com.cg;

public class Printer extends Machine {

	final int inkLevel=20;
	
	public Printer() {
		super(10);
		System.out.println("Printer Initialized..");
	}
	
	@Override
	public void start() {
		System.out.println("Printer Started...");
	}
	
	public void print() {
		super.print();
		System.out.println("Printing Started...");
	}
	
	
	
	
	
}
