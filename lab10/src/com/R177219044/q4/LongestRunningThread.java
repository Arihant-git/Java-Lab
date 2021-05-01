package com.R177219044.q4;

public class LongestRunningThread extends Thread{
	@Override
	public void run() {
		System.out.println("Longest Running thread.");
		System.out.println(Thread.currentThread().getName());
	}

}
