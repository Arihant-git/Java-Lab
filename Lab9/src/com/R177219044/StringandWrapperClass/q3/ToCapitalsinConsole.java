package com.R177219044.StringandWrapperClass.q3;
import java.util.*;

public class ToCapitalsinConsole {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter new String: ");
		StringBuffer bf = new StringBuffer(s.nextLine());
		
		for(int i=0;i<bf.length();i++) {
			char c = bf.charAt(i);
			if(('a'<=c) && (c<='z')) {
				char capital_c = (char)(c+'A'-'a');
				bf.setCharAt(i,capital_c);
			}
		}
		System.out.println(bf);
		s.close();
	}
}
