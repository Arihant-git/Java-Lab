package com.R177219044.q5;

class Employee
{
	String name;
	int empid;
	int salary;
	public Employee(){
		
	}
	
	public Employee(String name, int empid, int salary) {
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}
	
	public void show() {
		System.out.println("Name of the employee: "+name+"\nSalary of "+name+" is: "+salary+" rupees");
	}
	
	public double increaseSalary(double increament) {
		 double increamentsalary = salary*(increament/100);
		return salary+increamentsalary;
	}
}

class Manager extends Employee
{	
	String  department;
}

public class Organisation {

	public static void main(String[] args) {
		Employee e1 = new Employee("Raju",42011,20000);
		e1.show();
		System.out.println();
		
		Employee e2 = new Employee("Shyam",42022,60000);
		e2.show();
		e2.increaseSalary(15);
		System.out.println();
		
		Employee e3 = new Employee("Babu Rao",420033,5000);
		e3.show();
		System.out.println("Salary increament: "+e3.increaseSalary(10));
		System.out.println();

	}

}
