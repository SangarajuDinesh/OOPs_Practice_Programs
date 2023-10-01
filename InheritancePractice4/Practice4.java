package com.kn.InheritancePractice4;

public class Practice4 
{
	public static void main(String[] args) 
	{
		MotorCycle mc=new MotorCycle();
		mc.manufacturer="TATA";
		mc.model="New";
		mc.year=2023;
		mc.fuelType="Diesel";
		mc.fuelEfficiency();
		mc.distanceTravelled();
		mc.max_Speed();
	}
}
