package com.R177219044.q3;

class Worker
{
	public String name;
	public int salaryrate;
	public int ComPay() {
		return 0;
	} 
	public int ComPay(int hours) {
		return 0;
	}
}

class DailyWorker extends Worker
{
	public int ComPay(int hours) {
		int salary = salaryrate*hours; 
		System.out.println(name+" -> "+salary+" rupees per week");
		return 0;
	}
	
}

class SalariedWorker extends Worker
{
	public int ComPay() {
		int salary = salaryrate*40;
		System.out.println(name+" -> "+salary+" rupees per week");
		return 0;
	} 
}


public class Salary {
	public static void main(String args[]) {
		Worker R1 = new DailyWorker();
		R1.name = "Ajay";
		R1.salaryrate = 30;
		R1.ComPay(50);
		
		Worker R2 = new SalariedWorker();
		R2.name = "Prateek";
		R2.salaryrate = 500;
		R2.ComPay();
		
		Worker R3 = new DailyWorker();
		R3.name = "Reena";
		R3.salaryrate = 120;
		R3.ComPay(80);
	}

}
