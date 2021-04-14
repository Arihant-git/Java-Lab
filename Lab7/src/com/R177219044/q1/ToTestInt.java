package com.R177219044.q1;

interface Test{
	int square(int num);
}

class Arithmetic implements Test{

	public int square(int num) {
		return num*num;
	}
	
} 

public class ToTestInt {
	public static void main(String args[]) {
		Arithmetic ar1 = new Arithmetic();
		int num = 21;
		System.out.println("Square of "+ num+" is "+ar1.square(num));
	}

}
