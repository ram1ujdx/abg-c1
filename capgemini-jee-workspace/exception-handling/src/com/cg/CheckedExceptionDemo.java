package com.cg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedExceptionDemo {

	public static void main(String[] args) {

		NameReader reader=new NameReader();
		
		String name;
		try {
			name = reader.readName();
			System.out.println("Name is " + name);
		} catch (InvalidNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Completed...");

	}

}
