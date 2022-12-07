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
		return super.findArea() * getLength();
		//return Math.PI * getRadius() * getRadius() * getLength();
	}
	
	@Override
	public double findArea() {//返回圆柱的表面积
		//return Math.PI * getRadius() * getRadius() * 2 + Math.PI * 2 * getRadius() * getLength(); 
		//return Math.PI * getRadius() * 2 * (getRadius() + getLength());
		return super.findArea() * 2 + Math.PI * 2 * getRadius() * getLength();
	}
}
