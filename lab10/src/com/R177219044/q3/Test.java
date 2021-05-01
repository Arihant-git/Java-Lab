package com.R177219044.q3;

public class Test {

	public static void main(String arg[]) throws Exception {
		Increament i1 = new Increament();
		NewThread th1 = new NewThread(i1);
		NewThread th2 = new NewThread(i1);
		NewThread th3 = new NewThread(i1);
		NewThread th4 = new NewThread(i1);
		NewThread th5 = new NewThread(i1);
		NewThread th6 = new NewThread(i1);
		NewThread th7 = new NewThread(i1);
		NewThread th8 = new NewThread(i1);
		NewThread th9 = new NewThread(i1);
		NewThread th10 = new NewThread(i1);
		//System.out.println(d10.count);
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
		th6.start();
		th7.start();
		th8.start();
		th9.start();
		th10.start();
	}

}
