package com.cg;

public class MultiThreadingExampleWithRunnable {

	public static void main(String[] args) {

		Runnable r1 = new NumberPrinterI();
		Runnable r2=new NumberPrinterJ();

		Thread thread1=new Thread(r1);
		Thread thread2=new Thread(r2);
		
		thread1.start();
		thread2.start();
		

	}

}

class NumberPrinterI implements Runnable {

	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println("i = " + i);
		}
	}
}

class NumberPrinterJ implements Runnable{

	public void run() {
		for (int j = 1; j <= 20; j++) {
			System.out.println("j = " + j);
		}
	}
}