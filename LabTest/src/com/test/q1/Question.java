package com.test.q1;

interface Divisions
{
	public void division(int i,int j);
	public void modules(int i, int j);
}

class DivisionImplementation implements Divisions
{
	public void division(int i,int j) {
		System.out.println("Division: "+i/j);
	}
	
	public void modules(int i,int j) {
		System.out.println("Modules: "+i%j);
	}
}

public class Question {
	public static void main(String args[])
	{
		DivisionImplementation di1 = new DivisionImplementation();
		di1.division(18, 3);
		di1.modules(18, 3);
	}

}
