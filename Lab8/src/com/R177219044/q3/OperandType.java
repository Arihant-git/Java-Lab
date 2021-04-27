package com.R177219044.q3;
import java.util.*;

class exceptionclass extends Exception{
	exceptionclass()
	{
		super("Exception in the program. : From Exception class\n");
	}
}

public class OperandType {
	
	public static boolean moduluscheck(String str1,String str2) {
		try {
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		System.out.println(num1%num2);
		}
		
		catch (NumberFormatException e) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		String str1 = sc.nextLine();
		System.out.println("Enter second number: ");
		String str2 = sc.nextLine();
		
		try {
			if(moduluscheck(str1,str2))
				throw new exceptionclass();
				
		}
		
		catch (exceptionclass e) {
			System.out.println(e);
		}
		
		

	}

}
