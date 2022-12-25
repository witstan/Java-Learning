package com.witstan.java2;

import com.witstan.java1.Order;

public class SubOrder extends Order {
	
	public void method(){
		orderProtected = 1;
		orderPublic = 2;
		
		methodProtected();
		methodPublic();
		
		//在不同包的子类种，不能使用Order中声明为private和缺省的属性和声明；
	}
}
