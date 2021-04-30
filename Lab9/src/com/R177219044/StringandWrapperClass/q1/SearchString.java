package com.R177219044.StringandWrapperClass.q1;
import java.util.*;

public class SearchString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string:  ");
		String str1 = s.nextLine();
		System.out.println("Enter the substring to search: ");
		String str2 = s.nextLine();
		
		int flag = 0;
		int str1_length = str1.length();
		int str2_length = str2.length();
		for(int i=0;i<=(str1_length-str2_length);i++) {
			if(str1.substring(i,i+str2_length).equals(str2)) {
				if(flag == 0) {
					System.out.println("First ouccurence of "+str2+" is at "+(i+1)+" postion.");
				}
				flag = i;
			}
		}
		
		
		if(flag != 0) {
			System.out.println("Last occurence of "+str2+" is at "+(flag+1)+" position.");
		}
		else {
			System.out.println("String not found!!!");
		}
		
		s.close();

	}

}
