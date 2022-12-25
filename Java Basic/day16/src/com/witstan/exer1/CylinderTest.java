package com.witstan.exer1;
/*
 * 在CylinderTest类中创建Cylinder类的对象，设置圆 
 * 柱的底面半径和高，并输出圆柱的体积。
 * 
 */
public class CylinderTest {
	public static void main(String[] args) {
		
		Cylinder c1 = new Cylinder();
		double r = c1.getRadius();
		System.out.println(r);
		
		double l = c1.getLength();
		System.out.println(l);
		
		
		c1.setRadius(22.1);
		c1.setLength(31.4);
		
		double volume = c1.findVolume();
		System.out.println(volume);
		
		double area = c1.findArea();
		System.out.println(area);
	}
}
