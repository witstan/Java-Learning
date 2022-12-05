package com.witstan.exer1;

public class Cylinder extends Circle{
	
	private double length;
	
	public Cylinder(){
		this.length = 1;
	}
	
	public void setLength(double length){
		this.length = length;
	}
	
	public double getLength(){
		return length;
	}
	
	public double findVolume(){
		return findArea() * getLength();
	}
}
