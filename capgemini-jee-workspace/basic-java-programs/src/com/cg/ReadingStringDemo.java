package com.cg;

import java.util.Scanner;

public class ReadingStringDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Designation : ");
		String designation=scan.nextLine();
		if(designation.equalsIgnoreCase("Programmer")) {
			System.out.println("Scheme B");
		}

	}

}
