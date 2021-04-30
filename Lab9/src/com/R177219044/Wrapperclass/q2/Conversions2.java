package com.R177219044.Wrapperclass.q2;
import java.util.*;

public class Conversions2 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter float value: ");
		float n = s.nextFloat();
		Float F = new Float(n);
		System.out.println("float --> Float: "+F);
		String S = String.valueOf(F);
		System.out.println("FLoat --> string: "+S);
		float c = Float.parseFloat(S);
		System.out.println("String --> float: "+c);
		String q = String.valueOf(c);
		System.out.println("float --> String: "+q);
		Float r = Float.valueOf(S);
		System.out.println("String --> Float: "+r);
		float f = r.floatValue();
		System.out.println("Float --> float: "+f);
	}
}
