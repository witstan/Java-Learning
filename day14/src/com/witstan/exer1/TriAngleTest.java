package com.witstan.exer1;

public class TriAngleTest {
	public static void main(String[] args) {
		
		TriAngle t1 = new TriAngle(5, 8);
		t1.setBase(9.1);
		t1.setHeight(19.7);
		System.out.println("base = " + t1.getBase() + ", height = " + t1.getHeight());
		
		double area = t1.getArea(t1.getBase(), t1.getHeight());
		System.out.println("三角形的面积为：" + area);
		
	}
	
	
}
