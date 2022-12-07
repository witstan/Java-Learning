package com.witstan.exer1;
/*
 * 定义一个测试类GeometricTest，编写equalsArea方法测试两个对象的面积是否相等（注意方法的参 
数类型，利用动态绑定技术），编写displayGeometricObject方法显示对象的面积（注意方法的参
数类型，利用动态绑定技术）。
 * 
 */
public class GeometricTest {
	public static void main(String[] args) {	
		
		Circle c1 = new Circle(3, "red", 10);
		MyRectangle r1 = new MyRectangle(3, 5, "blue", 8);
		
		GeometricTest test = new GeometricTest();
		boolean result = test.equalsArea(c1, r1);
		System.out.println(result);
		
		double c1Area = test.displayGeometricObject(c1);
		double r1Area = test.displayGeometricObject(r1);
		
		System.out.println("Circle c1 area = " + c1Area + ", Rectangle r1 area = " + r1Area);
		
	}
	
	
	
	public boolean equalsArea(GeometricObject g1, GeometricObject g2){
		if(g1.findArea() == g2.findArea()){
			return true;
		}else{
			return false;
		}
		//或
		//return g1.findArea() == g2.findArea();
	}
	
	public double displayGeometricObject(GeometricObject g1){
		return g1.findArea();
	}
}
