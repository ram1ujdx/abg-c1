package com.cg;
import java.util.Scanner;

public class FirstProgram {

	public static void main(String[] args) {
		//Creating Scanner class object
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Hello from Capgemini..");
		//Declaring Variables
		int num1, num2;
		System.out.println("Enter value for Num1 ");
		//Reading num1
		num1=scan.nextInt();
		System.out.println("Enter value for Num2 ");
		//Reading num2
		num2=scan.nextInt();
		
		int sum=num1+num2;
		System.out.println(num1+" + "+num2+" = "+sum);
		
	}

}
