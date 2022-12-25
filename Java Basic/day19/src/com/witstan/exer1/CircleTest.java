package com.witstan.exer1;

import org.junit.Test;

public class CircleTest {
	
	@Test
	public void test1(){
		
	}
	
	
	
	public static void main(String[] args) {
		
		Circle c1 = new Circle(12.0, "Yellow", 1.0);
		Circle c2 = new Circle(2.0, "Red", 1.0);
		
		boolean samecolor = c1.getColor().equals(c2.getColor());
		System.out.println("两个圆的颜色是否相同？" + samecolor);
		
		boolean samearea = c1.equals(c2);
		System.out.println("两个圆的面积是否相同？" + samearea);
		
		System.out.println("c1：" + c1.toString());
		System.out.println("c2：" + c2.toString());
	}
}
