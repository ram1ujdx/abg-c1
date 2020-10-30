package com.cg;

public class MultiThreadingExample {

	public static void main(String[] args) {

		NumberPrinter1 thread1 = new NumberPrinter1();
		NumberPrinter2 thread2=new NumberPrinter2();

		thread1.start();
		thread2.start();

	}

}

class NumberPrinter1 extends Thread {

	public void run() {
		for (int i = 1; i <= 20; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("i = " + i);
		}
	}
}

class NumberPrinter2 extends Thread {

	public void run() {
		for (int j = 1; j <= 20; j++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(j==10) {
				yield();
			}
			System.out.println("j = " + j);
		}
	}
}