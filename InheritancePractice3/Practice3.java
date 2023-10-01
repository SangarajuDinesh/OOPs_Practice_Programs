package com.kn.InheritancePractice3;

import java.util.Scanner;

public class Practice3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int id=sc.nextInt();
		String fName=sc.next();
		String jobTitle=sc.next();
		Employee emp=new Employee();
		System.out.println(emp.getEmployeeID(id));
		System.out.println(emp.getFirstName(fName));
		System.out.println(emp.getLastName(jobTitle));
		sc.close();
	}
}
