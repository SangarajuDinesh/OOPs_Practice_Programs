package com.kn.EncapsulationPractice7;

import java.util.Scanner;

public class Practice7
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student_ID = ");
		int id=sc.nextInt();
		System.out.println("Enter the Student_Name = ");
		String name=sc.next();
		System.out.println("Enter the Grade = ");
		char grade=sc.next().charAt(0);
		Student s=new Student();
		s.setStudent_id(id);
		s.setStudent_name(name);
		s.setGrade(grade);
		System.out.println(s.getStudent_id());
		System.out.println(s.getStudent_name());
		s.getGrade();
		sc.close();
	}
}
