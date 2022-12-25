package com.witstan.homework;

public class Day10Homework {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		
		c1.setRadius(1);
		
		double area = c1.getArea();
		System.out.println(area);
	}
}

class Circle{
	
	private double radius;
	
	public Circle(){
		
	}
	
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	public double getRadius(){
		return this.radius;
	}
	
	public double getArea(){
		return Math.PI * this.getRadius() * this.getRadius();
	}
}
