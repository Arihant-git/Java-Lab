package com.R177219044.q1;
import java.util.*;

public class AllCombinations {
	

	public static void main(String[] args) {
		int[] numbers = new int[3];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		for(int i=0;i<3;i++) {
			numbers[i] = s.nextInt();
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<3;k++) {
					if(i!=j && j!=k) {
						System.out.println(numbers[i]+" "+numbers[j]+" "+numbers[k]);
					}
				}
			}
		}

		
		
	}

}
