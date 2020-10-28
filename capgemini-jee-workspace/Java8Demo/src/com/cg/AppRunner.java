package com.cg;

@FunctionalInterface
interface MyInterface {

	int calculate(int a);
}

public class AppRunner {

	public static void main(String[] args) {

		MyInterface obj = x -> {
									System.out.println("Calculation Processing...");
									return x * x;
								};

		int result = obj.calculate(5);
		System.out.println(result);

	}

}

//MyInterface obj=new MyInterface() {
//	public void myMethod() {
//		System.out.println("My Method Called");
//	}
//};
