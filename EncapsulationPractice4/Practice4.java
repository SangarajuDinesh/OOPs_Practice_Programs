package com.kn.EncapsulationPractice4;

import java.util.Scanner;

public class Practice4 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ID = ");
		int id=sc.nextInt();
		System.out.println("Enter the Name = ");
		String name=sc.next();
		System.out.println("Enter the salary = ");
		double salary=sc.nextDouble();
		Employee emp=new Employee();
		emp.setData(id, name, salary);
		System.out.println(emp.getID());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		sc.close();
	}
}
