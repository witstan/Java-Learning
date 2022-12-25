package com.witstan.exer1;
/*
 * （ 1 ） 定 义 一 个 Circle 类 ， 包含一个double型的radius 属 性 代 表 圆 的 半 径 ， 一个 findArea()方法返回圆的面积。
 * 
 * 
 * 
 */

public class Circle {
	
	double radius;
	
	public double findArea(){
		return radius * radius * Math.PI;
	}
}
	
	