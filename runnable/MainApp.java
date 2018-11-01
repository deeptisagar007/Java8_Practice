package com.Java8.runnable;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("MainApp main Starts");
		Runnable run1 = () -> {
			for (int counter = 1; counter <= 10; counter++) {
				System.out.println("From run1 Deepti: " + counter);
				System.out.println("");
			}
		};

		MyRunnable mRun = new MyRunnable();

		Thread t1 = new Thread(run1);
		Thread t2 = new Thread(mRun);
		t1.start();
		t2.start();
		System.out.println("MainApp main ends");

	}
}

class MyRunnable implements Runnable {
	@Override
	public void run() {
		for (int counter = 1; counter <= 10; counter++) {
			System.out.println("In Run of MyRun " + counter);
			System.out.println("");
		}
	}
}
