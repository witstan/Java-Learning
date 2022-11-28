package com.witstan.exercises;
/*
 * 利用面向对象的编程方法，设计类Circle计算圆的面积。
 * 
 */
//测试类
public class CircleTest {
	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		c1.radius = 2.2;
		
		//对应方式一
		//double area = c1.CircleArea();
		//System.out.println(area);
		
		//方式二
		c1.CircleArea();
	}
}

//圆
class Circle{
	
	//属性
	double radius;
	
	//求圆的面积
	//方式一
	
	/*public double CircleArea(){
		double area = Math.PI * radius * radius;
		return area;	
	}*/
	
	//方式二
	public void CircleArea(){
		double area = Math.PI * radius * radius;
		System.out.println("面积为：" + area);
	}
	
	
}