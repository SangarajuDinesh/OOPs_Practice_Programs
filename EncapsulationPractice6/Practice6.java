package com.kn.EncapsulationPractice6;

import java.util.Scanner;

public class Practice6 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Company Name = ");
		String name=sc.next();
		System.out.print("Enter the Model = ");
		String model=sc.next();
		System.out.print("Enter the Year = ");
		int year=sc.nextInt();
		System.out.print("Enter the Mileage = ");
		double mileage=sc.nextDouble();
		Car c=new Car();
		c.setCompany_name(name);;
		c.setModel_name(model);
		c.setYear(year);
		System.out.println(c.getCompany_name());
		System.out.println(c.getModel_name());
		System.out.println(c.getYear());
		System.out.println(c.getMileage());
		sc.close();
	}
}
