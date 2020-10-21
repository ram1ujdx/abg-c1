package com.cg;

public class InterfaceExample {

	public static void main(String[] args) {
		
		Object obj1=new MyClass();
		Intr2 obj2=new MyClass();
//		
//		obj1.fun1();
//		obj1.show();
//		obj1.superFun();
//		obj2.fun2();
//		obj2.show();
		
		System.out.println(obj1 instanceof SuperInterface);
		

	}

}



class MyClass implements Intr1,Intr2{

	@Override
	public void fun2() {
		System.out.println("Function 2 Called");
		
	}

	@Override
	public void fun1() {
		System.out.println("Function 1 Called");
		
	}

	@Override
	public void show() {
		System.out.println("Hello...");
		
	}

	@Override
	public void superFun() {
		System.out.println("Super Fun...");
		
	}
	
}

interface SuperInterface{
	void superFun();
}

interface Intr1 extends SuperInterface{
	void fun1();
	void show();
}

interface Intr2 {
	void fun2();
	void show();
}