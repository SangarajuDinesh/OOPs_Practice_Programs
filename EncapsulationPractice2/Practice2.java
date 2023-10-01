package com.kn.EncapsulationPractice2;

import java.util.Scanner;

public class Practice2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Account Number = ");
		long accountNumber=sc.nextLong();
		System.out.println("Enter the balance = ");
		double balance =sc.nextDouble();
		BankAccount na=new BankAccount();
		na.setAccountNumber(accountNumber);
		na.setBalance(balance);
		System.out.println(na.getAccountNumber());
		System.out.println(na.getBalance());
		sc.close();
	}
}
