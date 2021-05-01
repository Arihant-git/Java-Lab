package com.R177219044.q1;

public class ThreadingByRunnable implements Runnable {
	public void run() {
		System.out.println("Thread is executed using runnable interface.");
	}

	public static void main(String args[]) {
		ThreadingByRunnable a = new ThreadingByRunnable();
		Thread th = new Thread(a);
		th.start();
		
		ThreadingByRunnable a1 = new ThreadingByRunnable();
		Thread th2 = new Thread(a1);
		th2.start();
	}
}
