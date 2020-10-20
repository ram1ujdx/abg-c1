package com.cg;

public class MethodOverloading {

	public static void main(String[] args) {
		
		Adder adder=new Adder();
		System.out.println(adder.add(10, 20.5f));
		System.out.println(adder.add(25, 30, 40));
		System.out.println(adder.add(2.5f, 3.2f));
		
	}
	
}

class Adder{
	public int add(int a, int b) {
		return a+b;
	}
	public float add(int a, float b) {
		return a+b;
	}
	public float add(float a, float b) {
		return a+b;
	}
	public float add(float a, int b) {
		return a+b;
	}
	public int add(int a, int b, int c) {
		return a+b+c;
	}
}