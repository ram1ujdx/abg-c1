package com.cg;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Values for a and b: ");
		try {

			int a = scan.nextInt();
			int b = scan.nextInt();
			
			
			int result = 0;
			System.out.println("Operation Strated");

			result = a / b;
			System.out.println("Result = " + result);
		} catch (ArithmeticException ex) {
			System.err.println("Error!!! " + ex.getMessage());
		} catch (InputMismatchException ex) {
			System.err.println("Error!!! " + ex.getMessage());
		} catch (Exception ex) {
			System.err.println("Error!!! " + ex.getMessage());
		}

		finally {
			System.out.println("Execution Completed");
		}

	}

}
