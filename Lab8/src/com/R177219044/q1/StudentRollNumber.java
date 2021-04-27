package com.R177219044.q1;
import java.util.*;

public class StudentRollNumber {
	public static void main(String args[]) {
		int rollnumber;
		String[] names = {"Ajay","Atul","Arya","Aman","Dora","John",
				"Reeta","Raman","Tim","Virat"};
		int[] rollnumlist = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Enter roll number of the student: ");
		Scanner sc = new Scanner(System.in);
		
		try {
			rollnumber = sc.nextInt();		
			System.out.println("Roll number: "+rollnumber+" "
					+ "-> Name: "+names[rollnumber-1]);
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception in the program.\n"+e);
		}
	}
}
