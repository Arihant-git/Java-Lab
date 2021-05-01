package com.R177219044.q1;

public class ThreadingByThreadClass extends Thread {
	
	public void run(){  
		System.out.println("Thread is executed by extending Thread class.");  
		}  

	public static void main(String[] args) {
		ThreadingByThreadClass th=new ThreadingByThreadClass();  
		th.start(); 
		ThreadingByThreadClass th2=new ThreadingByThreadClass();  
		th2.start();

	}

}
