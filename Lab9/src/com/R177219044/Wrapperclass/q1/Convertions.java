package com.R177219044.Wrapperclass.q1;
import java.util.*;

public class Convertions {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value: ");
		int value = s.nextInt();
		System.out.println("Type of the value is -- primitive int");
		@SuppressWarnings("deprecation")
		Integer integervalue = new Integer(value);
		System.out.println("Type of the value is --"+
		integervalue.getClass().getSimpleName());
		
		String stringvalue = String.valueOf(integervalue);
		System.out.println("Type of the value is --"+
		stringvalue.getClass().getSimpleName());
		
		integervalue = Integer.valueOf(stringvalue);
		System.out.println("Type of the value is --"+
		integervalue.getClass().getSimpleName());
		
		value = Integer.parseInt(stringvalue);
		System.out.println("Type of the value is -- primitive int");
		
		s.close();
		
		
		
		
		
		

	}

}
