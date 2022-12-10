package com.witstan.java3;
/*
 * 对属性赋值的位置：
 * ①默认初始化
 * ②显式初始化/在代码块中赋值(谁在代码中位置靠前谁先执行)
 * ③构造器中初始化
 * ④创建对象后，通过“对象.属性”或“对象.方法”的方式进行赋值
 * 
 * 执行顺序：① - ② - ③ - ④
 */
public class OrderTest {
	public static void main(String[] args) {
		Order o = new Order();
		System.out.println(o.id);
	}
}

class Order{
	
	int id = 3;
	{
		id = 4;
	}
	
}
