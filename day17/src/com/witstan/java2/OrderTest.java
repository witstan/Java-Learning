package com.witstan.java2;

import com.witstan.java1.Order;

public class OrderTest {
	public static void main(String[] args) {
		
		Order o = new Order();
		
		o.orderPublic = 1;
		
		o.methodPublic();
		
		//不同包下的普通类（非子类）要使用Order类，不可调用Order中声明为public以外权限的属性和方法
	}
}
