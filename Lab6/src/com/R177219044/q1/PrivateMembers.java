package com.R177219044.q1;

class SuperClass
{
	public int a;
	public int b;
	private int pa;
	private int pb;
	
	public void print() {
		System.out.println("a = "+a+"\nb = "+b);
	}
	
	private void privateprint(){
		System.out.println("Private a = "+pa+"\nPrivate b = "+pb);
	}
}

public class PrivateMembers {

	public static void main(String[] args) {
		SuperClass sc = new SuperClass();
		sc.a = 5;
		sc.b = 2;
		sc.print();
		
		//sc.pa = 9;
		//sc.pb = 10;
		//sc.privateprint();

	}

}
