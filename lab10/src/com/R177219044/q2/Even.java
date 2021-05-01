package com.R177219044.q2;

public class Even extends Thread {
	public void run() {
		System.out.println("Thread2:");
		for(int i = 2;i<=10;i=i+2) {
			System.out.println(i);
			
		}
			
		
	}
}
