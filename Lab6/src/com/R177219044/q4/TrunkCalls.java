package com.R177219044.q4;

class TelephonePricing
{
	
	public double ordinarycharges(double min) {
		return 0;
	}
	
	public double urgentcharges(double min) {
		return 0;
	}
	
	public double lightningcharges(double min) {
		return 0;
	}
}

class Ordinary extends TelephonePricing
{
	public double ordinarycharges(double min) {
		return min*1;
	}
}

class Urgent extends TelephonePricing
{
	public double urgentcharges(double min) {
		return min*1.5;
	}
}

class Lightning extends TelephonePricing
{
	public double lightningcharges(double min) {
		return min*1.8;
	}
}


public class TrunkCalls {
	public static void main(String args[]) {
		
		TelephonePricing tp1 = new Ordinary();
		System.out.println(tp1.ordinarycharges(13)+" rupees");
		
		TelephonePricing tp2 = new Urgent();
		System.out.println(tp2.urgentcharges(5.20)+" rupees");
		
		TelephonePricing tp3 = new Lightning();
		System.out.println(tp3.lightningcharges(15.12)+" rupees");
	}
}
