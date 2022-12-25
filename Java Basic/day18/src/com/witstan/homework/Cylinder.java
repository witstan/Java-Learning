package com.witstan.homework;

public class Cylinder extends Circle {
	
	public static void main(String[] args) {
		
		Cylinder c = new Cylinder();
		
		c.setRadius(8);
		c.setLength(8);
		
		System.out.println(c.findArea());
		System.out.println(c.findVolume());
	}
	
	private double length;
	
	private Cylinder(){
		length = 1;
	}
	
	public void setLength(double length){
		this.length = length;
	}
	
	public double getLength(){
		return length;
	}
	
	@Override
	public double findArea() {
		return super.findArea() * 2 + getLength() * getRadius() * 2 * Math.PI;
	}
	
	public double findVolume(){
		return super.findArea() * getLength();
	}
}
