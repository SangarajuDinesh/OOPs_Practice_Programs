package com.kn.EncapsulationPractice1;

import java.util.Scanner;

public class Practice1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Person p=new Person();
		p.setData("dinesh", 22, "India");
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getCountry());
		sc.close();
	}
}
