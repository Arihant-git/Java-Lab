package com.R177219044.q4;
import java.util.*;

class CarClash extends Exception{
	CarClash()
	{
		super("Car will clash.\n ");
	}
}

public class Collision {
	public static void main(String args[]) {
		boolean samedirec;
		Scanner sc = new Scanner(System.in);
		System.out.println("Are vehicles moving in same direction.(true/false)");
		samedirec = sc.nextBoolean();
		
		try {
			if(samedirec == true)
				throw new CarClash();
			else
				System.out.println("Car will not clash");
		}
		
		catch (CarClash e) {
			System.out.println(e);
		}
		
	}
}

