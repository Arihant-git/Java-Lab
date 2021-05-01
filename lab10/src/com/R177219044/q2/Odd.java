package com.R177219044.q2;

public class Odd extends Thread{
	public void run() {
		System.out.println("Thread1:");
		for(int i = 1;i<=10;i=i+2) {
			System.out.println(i);
		}
	}
}
