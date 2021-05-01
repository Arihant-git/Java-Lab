package com.R177219044.q2;

public class OddEvenThreads extends Thread {

	public static void main(String[] args) {
		
		Odd o = new Odd();
		o.start();
		
		Even e = new Even();
		e.start();

	}

}
