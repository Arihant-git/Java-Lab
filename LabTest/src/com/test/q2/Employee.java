package com.test.q2;

class Department implements Cloneable
{
	String Department_name;
	String Department_id;
	
	public Department() {
		
	}
	
	public Department(String Department_name, String Department_id) {
		this.Department_id = Department_id;
		this.Department_name = Department_name;
	}
	
	public void show() {
		System.out.println("Department ID: "+Department_id+" Department name: "+Department_name);
	}
	
	protected Department clone() throws CloneNotSupportedException
	{
		return (Department)super.clone();
	}
}

public class Employee implements Cloneable{
	
	int id;
	String name;
	Department dep;
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public Department getDep() {
		return dep;
	}


	public void setDep(Department dep) {
		this.dep = dep;
	}


	public Employee() {
		
	}
	
	public Employee(int id,String name)
	{
		setId(id);
		setName(name);
		setDep(dep);
	}
	
	public void show() {
		System.out.println("Employee ID: "+getId()+"\nEmployee name: "+getName());
	}
	
	
	@Override
	protected Employee clone() throws CloneNotSupportedException
	{
		Employee e2 = (Employee)super.clone();
		return e2;
	}
	
	
	
	


	public static void main(String[] args)
			throws CloneNotSupportedException
	{
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(210,"Raj");
		Department dep = new Department("Administration","A298");
		e1.show();
		Employee e2 = (Employee)e1.clone();
		e2.show();
		dep.show();
		Department dep1 = (Department)dep.clone();
		dep1.show();
		
	
		
	}

}
