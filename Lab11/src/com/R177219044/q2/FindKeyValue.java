package com.R177219044.q2;
import java.util.*;

public class FindKeyValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		HashMap<Integer,String> h = new HashMap<>(); 
		h.put(1,"AI and ML");
		h.put(2,"App Development");
		h.put(3,"Web Development");
		h.put(4,"Blockchain");
		h.put(5,"Virtual Reality and Augmented Reality");
		
		
		System.out.println("Enter the key you want to search: "); 
		int key = sc.nextInt();
		if(h.containsKey(key)) 
			System.out.println("Key exists");
		else
			System.out.println("Key does not exist"); 
		
		
		System.out.println("Enter the value you want to search: "); 
		String val = new String(sc.next());
		if(h.containsValue(val))
			System.out.println("Value exists");
		else
			System.out.println("Value does not exist"); 
		
		System.out.println("All the keys are:\n"+h);
		
		}

}
