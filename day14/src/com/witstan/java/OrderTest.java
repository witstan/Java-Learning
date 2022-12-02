package com.witstan.java;

public class OrderTest {
	public static void main(String[] args) {
		
		Order order = new Order();
		
		order.orderDefault = 1;
		order.orderPublic = 2;
		//出了Order类之后，私有的结构就不可调用了
		//order.orderPrivate = 3;//The field Order.orderPrivate is not visible
	
		order.methodDefault();
		order.methodPublic();
		//出了Order类之后，私有的结构就不可调用了
		//order.orderPrivate();//The method orderPrivate() is undefined for the type Order
		
		
	}
}
