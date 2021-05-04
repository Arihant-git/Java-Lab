package com.R177219044.q3;
import java.util.*;
public class HashSetCollection {
	public static void main(String args[]){
	
	HashSet<String> hs = new HashSet<String>(); 
	hs.add("ai and ml");
	hs.add("web development");
	hs.add("android developpment");
	System.out.println("Initial HashSet\n"+hs);
	System.out.println();
	
	HashSet<String> newhs = new HashSet<String>();
	newhs.add("bloclchain");
	newhs.add("virtual reality");
	newhs.addAll(hs);
	System.out.println("New HashSet:"); 
	System.out.println(newhs);
	System.out.println();
	
	newhs.clear();
	newhs.add("cyber security");
	newhs.add("internet of things");
	String key = new String("internet of things");
	System.out.println("HashSet contains enterd key: "+newhs.contains(key));
	}
}
