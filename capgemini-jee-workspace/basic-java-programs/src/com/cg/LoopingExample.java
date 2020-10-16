package com.cg;

public class LoopingExample {

	public static void main(String[] args) {
		
		int limit=5;
		int counter=10;
		
// Entry Controlled Loop
		
//		while(counter<limit) {
//			System.out.println("Capgemini");
//			counter++;
//		}

// Exit Controlled Loop
		
//		do {
//			System.out.println("Capgemini");
//			counter++;
//		}while(counter<limit);
		
		
		for(;;counter++) {
			System.out.println("Capgemini");
			if(counter>limit) {
				break;
			}
		}
		

		System.out.println("Completed...");
	}

}
