package com.witstan.exer1;
/*
 * （ 2） 定 义 一 个 类 PassObject， 在 类 中 定 义 一 个 方 法 printAreas()， 该 方 法 的 定 义 
如下：public void printAreas(Circle c, int time)
在printAreas方 法中打印输出 1到time之间的 每个整数半径 值 ，以及对应 的面积 。 
例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积。
 * 
 * （ 3） 在 main方法中调用printAreas()方法， 调 用完毕后输出当前半径值。程序运行结果如图 所示。
 * 
 */
public class PassObject {
	
	public static void main(String[] args) {
		
		PassObject test = new PassObject();
		
		Circle c = new Circle();
		
		test.printAreas(c, 5);
		
		System.out.println("now radius is ： " + (c.radius));
	}
	
	
	public void printAreas(Circle c, int time){
		System.out.println("Radius\t\tArea");
		//设置圆的半径
		c.radius = 1;
		while(c.radius <= time){
			System.out.println(c.radius + "\t\t" + c.findArea());
			c.radius++;
		}
	}
	
	
}
