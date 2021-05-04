package com.R177219044.q1;
import java.util.*;
public class ReverseArrayList {
	
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(10);
		System.out.println("Initial array list:\n"+list);
		
		ArrayList<Integer> reverselist = new ArrayList<Integer>();
		reverselist = (ArrayList)list.clone();
		System.out.println("\nClone of array list:\n"+reverselist);
		
		int num = 0;
		for(int i=list.size()-1; i>=0; i--) {
			int reversenum = list.get(i);
			reverselist.set(num,reversenum);
			num = num+1;
			
		}
		System.out.println("\nReverse of array list:\n"+reverselist);
		
	}
}
