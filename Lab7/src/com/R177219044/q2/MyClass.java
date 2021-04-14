package com.R177219044.q2;

interface A{
	void meth1();
	void meth2();
}

public class MyClass implements A{
	public void meth1() {
		System.out.println("This is method 1.");
	}
	public void meth2() {
		System.out.println("This is method 2.");
	}
	public static void main(String args[]) {
		MyClass c1 = new MyClass();
		c1.meth1();
		c1.meth2();
	}
}
