package com.R177219044.q5;
import java.util.*;

public class Result {
	public static void main(String[] args) {
		System.out.println("Enter marks of 10 students.");
		int [] marks = new int[10];
		Scanner s = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			marks[i] = s.nextInt();
		}
		
		for(int i=0;i<10;i++) {
			for(int j=i+1;j<10;j++) {
				if(marks[i]>marks[j]) {
					int x;
					x = marks[i];
					marks[i] = marks[j];
					marks[j] = x;
				}
			}
		}
		
		for(int i=9;i>=0;i--) {
			if(marks[i]>75)	
				System.out.println("Marks: "+marks[i]+" Distinction");
			else if((marks[i]<=75) &&(marks[i]>50))
				System.out.println("Marks: "+marks[i]+" Merit");
			else if((marks[i]<=50) && (marks[i]>40))
				System.out.println("Marks: "+marks[i]+" Pass");
			else
				System.out.println("Marks: "+marks[i]);
				
		}
		
	}
}
