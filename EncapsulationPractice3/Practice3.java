package com.kn.EncapsulationPractice3;

import java.util.Scanner;

public class Practice3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length = ");
		int length=sc.nextInt();
		System.out.println("Enter the width = ");
		int width=sc.nextInt();
		Rectangle r=new Rectangle();
		r.setLength(length);
		r.setWidth(width);
		System.out.println(r.calculateArea());
		sc.close();
	}
}
