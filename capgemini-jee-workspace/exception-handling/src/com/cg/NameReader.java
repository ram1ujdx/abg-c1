package com.cg;

import java.util.Scanner;

public class NameReader {

	Scanner scan=new Scanner(System.in);
	String name;
	public String readName()throws InvalidNameException {
		System.out.println("Enter a name");
		name=scan.nextLine();
		if(name.length()<3) {
			throw new InvalidNameException("Inavlid Name");
		}
		return name;
	}
}
