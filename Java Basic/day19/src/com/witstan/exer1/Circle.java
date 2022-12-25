package com.witstan.exer1;

public class Circle extends GeometricObject {
	
	private double radius;
	
	public Circle(){
		super();
		radius = 1;
	}
	
	public Circle(double radius){
		super();
		this.radius = radius;
	}
	
	public Circle(double radius,String color,double weight){
		super(color,weight);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double findArea(){
		return Math.PI * getRadius() * getRadius();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null){
			return false;
		}
		if(this == obj){
			return true;
		}
		
		if(obj instanceof Circle){
			Circle c = (Circle)obj;
			if(this.getRadius() == c.getRadius()){
				return true;
			}
			return false;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "圆的半径 = " + getRadius();
	}
	
}
