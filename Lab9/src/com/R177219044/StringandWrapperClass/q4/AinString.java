package com.R177219044.StringandWrapperClass.q4;

public class AinString {
	String str;
	
	public AinString() {
		super();
		str = "arihant jain";
	}
	public AinString(String str) {
		 super();
		 this.str = str;
	}
	
	public void find_a() {
		System.out.println("'a' found at:");
		int a_count = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == 'a') {
				System.out.println((i+1)+" position");
				a_count = a_count+1;
			}
		}
		System.out.println("Number of 'a' found in "+str+" are: "+a_count);
	}
	
	public static void main(String args[]) {
		AinString obj = new AinString();
		obj.find_a();
		
		AinString obj1 = new AinString("An agile, angry ape addled up the avenue.");
		obj1.find_a();
	}
	 
	 
}
