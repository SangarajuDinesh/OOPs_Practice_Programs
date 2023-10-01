package com.kn.EncapsulationPractice4;

public class Employee 
{
	private int employee_ID;
	private String employee_name;
	private double salary;
	public int getID()
	{
		return employee_ID;
	}
	public String getName()
	{
		return employee_name;
	}
	public String getSalary()
	{
		return String.format("%.2f",salary);
	}
	public void setData(int id,String name,double salary)
	{
		employee_ID=id;
		employee_name=name;
		this.salary=salary;
	}
}
