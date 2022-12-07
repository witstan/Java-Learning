package com.witstan.java1;

public class OrderTest {
	public static void main(String[] args) {
		Order order = new Order();
		
		order.orderDefault = 1;
		order.orderProtected = 2;
		order.orderPublic = 3;
		
		order.methodDefault();
		order.methodProtected();
		order.methodPublic();
		
		//同一个包种的其他类，不可以调用Order类种声明为private的属性和方法
	}
}
