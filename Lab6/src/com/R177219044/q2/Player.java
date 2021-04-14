package com.R177219044.q2;

class Cricket_Player extends Player
{
	public void print(){
		System.out.println("This is Cricket_Player class.\n");
		
	}
}

class Football_Player extends Player
{
	public void print(){
		System.out.println("This is Football_Player class.\n");
	}

}

class Hockey_Player extends Player
{
	public void print(){
		System.out.println("This is Hockey_Player class.\n");
	}

}

public class Player {
	public static void main(String args[]) {
		Cricket_Player cpl = new Cricket_Player();
		cpl.printclass();
		cpl.print();
		
		Football_Player fpl = new Football_Player();
		fpl.printclass();
		fpl.print();
		
		Hockey_Player hpl = new Hockey_Player();
		hpl.printclass();
		hpl.print();
		
	}
	public void printclass() {
		System.out.println("This is player class.");
	}

}
