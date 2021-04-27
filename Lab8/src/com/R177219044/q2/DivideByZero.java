package com.R177219044.q2;
import java.util.*;

public class DivideByZero {
	public static void main(String args[]) {
		int dividend;
		int divisor;
		int answer = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Dividend: ");
		dividend = sc.nextInt();
		System.out.println("Enter Divisor: ");
		divisor = sc.nextInt();
		try {
			answer = dividend/divisor;
		}
		
		catch (ArithmeticException e){
			System.out.println("Exception in the program. "+e);
		}
		
		System.out.println("Answer: "+answer);
	}
}
