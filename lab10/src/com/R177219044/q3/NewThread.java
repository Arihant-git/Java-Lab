package com.R177219044.q3;


public class NewThread extends Thread{
	static int n = 0;
	Increament i;
	NewThread(Increament i){
		this.i = i;
	}
	
	public void run() {
		i.addone();
	}
	
}
