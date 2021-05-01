package com.R177219044.q4;

public class Test{

	public static void main(String args[]) throws InterruptedException {
		Thread th1 = new Thread();
		Thread th2 = new Thread();
		Thread th3 = new Thread();
		Thread th4 = new Thread();
		Thread th5 = new Thread();
		
		
		th1.setPriority(1);
		th2.setPriority(2);
		th3.setPriority(3);
		th4.setPriority(4);
		th5.setPriority(5);
		
		th1.start();
		if (th1.isAlive())
			System.out.println("Thread 1 is active");
		else
			System.out.println("Thread 1 is not alive");
		th2.start();
		if (th2.isAlive())
			System.out.println("Thread 2 is alive");
		else
			System.out.println("Thread 2 is not alive");
		th3.start();
		if (th3.isAlive())
			System.out.println("Thread 3 is alive");
		else
			System.out.println("Thread 3 is not alive");
		th4.sleep(10);
		if (th4.isAlive())
			System.out.println("Thread 4 is alive");
		else
			System.out.println("Thread 4 is not alive");
		th5.sleep(100);
		if (th5.isAlive())
			System.out.println("Thread 5 is alive");
		else
			System.out.println("Thread 5 is not alive");		
		
	}
	
}
