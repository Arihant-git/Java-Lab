package com.R177219044.q2;
import java.util.*;

public class SumOfSquare {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 10 numbers: ");
		for(int i=0;i<10;i++) {
			System.out.print("Enter Number: ");
			numbers[i] = s.nextInt();
		}
		int sum = 0;
		for(int i=0;i<10;i++) {
			System.out.print(numbers[i]*numbers[i]+" ");
			int q = numbers[i]*numbers[i];
			sum = sum+q;
		}
		System.out.println("\nSum is: "+sum);

	}

}
