package com.witstan.homework;

public class Circle {
		
	private double radius;
	
	public Circle(){
		radius = 1;
	}
	
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public double findArea(){
		return Math.PI * getRadius() * getRadius();
	}
}
