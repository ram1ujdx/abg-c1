package com.cg;

public class InheritanceExample {

	public static void main(String[] args) {
		
		Machine myMachine = new Printer();
		myMachine.start();
		myMachine.scan();
		myMachine.print();
		myMachine.stop();
		
		
		myMachine=new Scanner();
		myMachine.start();
		myMachine.scan();
		myMachine.print();
		myMachine.stop();
		
		

	}

}
