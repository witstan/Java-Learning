package com.witstan.exer1;

public class TriAngle {
	
	private double base;
	private double height;
	
	public TriAngle(){
		
	}
	
	public TriAngle(double i, double j){
		base = i;
		height = j;
	}
	
	public void setBase(double i){
		if(i <= 0){
			System.out.println("数据非法");
		}else{
			base = i;
		}
	}
	
	public void setHeight(double i){
		if(i <= 0){
			System.out.println("数据非法");
		}else{
			height = i;
		}
	}
	
	public double getBase(){
		return base;
	}
	
	public double getHeight(){
		return height;
	}
	
	public double getArea(double base, double height){
		return (base * height) / 2;
	}
}
