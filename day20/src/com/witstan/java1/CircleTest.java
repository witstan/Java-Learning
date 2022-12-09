package com.witstan.java1;
/*
 * static关键字应用
 * 
 */
public class CircleTest {
	public static void main(String[] args) {		
		
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		Circle c3 = new Circle();
		
		System.out.println("c1 id = " + c1.getId());
		System.out.println("c2 id = " + c2.getId());
		System.out.println("c3 id = " + c3.getId());
		
		System.out.println("输出的圆的个数为：" + Circle.getTotal());
	}
}


class Circle{
	private double radius;
	private int id;
	
	public Circle(){
		id = init++;
		total++;
	}
	
	public Circle(double radius) {
		this();
		this.radius = radius;
//		this.id = init++;
//		total++;
	}


	public double getRadius() {
		return radius;
	}

	public int getId() {
		return id;
	}

	public static int getTotal() {
		return total;
	}

	public static int getInit() {
		return init;
	}

	
	
	private static int total = 0;
	private static int init = 1001;//static声明的属性所有属性共用
	
	public double findArea(){
		return Math.PI * radius * radius;
	}
}
