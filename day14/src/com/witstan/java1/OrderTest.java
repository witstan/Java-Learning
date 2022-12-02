package com.witstan.java1;

import com.witstan.java.Order;

public class OrderTest {
	public static void main(String[] args) {
		
		Order order = new Order();
		
		//出了Order所属的包之后，缺省的结构和私有的结构都不可调用了
		//order.orderDefault = 1;
		order.orderPublic = 2;
		//order.orderPrivate = 3;//The field Order.orderPrivate is not visible
	
		//order.methodDefault();
		order.methodPublic();
		//order.orderPrivate();//The method orderPrivate() is undefined for the type Order
		
		
	}
}
