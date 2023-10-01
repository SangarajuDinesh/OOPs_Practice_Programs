package com.kn.EncapsulationPractice5;

public class Circle 
{
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public String clculateArea()
	{
		return String.format("%.3f",Math.PI*radius*radius);
	}
	public String calculatePerimeter()
	{
		return String.format("%.3f",2*Math.PI*radius);
	}
}
