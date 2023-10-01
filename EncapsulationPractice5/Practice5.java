package com.kn.EncapsulationPractice5;

import java.util.Scanner;

public class Practice5
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius of Circle = ");
		int radius=sc.nextInt();
		Circle c=new Circle();
		c.setRadius(radius);
		System.out.println(c.clculateArea());
		System.out.println(c.calculatePerimeter());
		sc.close();
	}
}
