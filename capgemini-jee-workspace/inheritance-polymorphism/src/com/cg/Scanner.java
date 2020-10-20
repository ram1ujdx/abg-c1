package com.cg;

public class Scanner extends Machine {

	int scanQuality;

	public Scanner() {
		super(5);
		System.out.println("Scanner Initialized..");
	}

	public void start() {
		System.out.println("Scanner Started...");
	}

	public void scan() {
		System.out.println("Scanning...");
	}

}
