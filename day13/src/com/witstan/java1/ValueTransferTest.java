package com.witstan.java1;
/*
 * 关于变量的赋值：
 * 
 * 	如果变量是基本数据类型，此时赋值的是变量所保存的数据值。
 * 	如果变量是引用数据类型，此时赋值的是变量所保存的数据的地址值。
 * 
 * 
 */
public class ValueTransferTest {
	
	public static void main(String[] args) {
		
		int m = 10;
		int n = m;
		
		System.out.println("m = " + m + ",  n = " + n);
		
		n = 20;
		System.out.println("m = " + m + ",  n = " + n);
		
		Order o1 = new Order();
		
		o1.OrderID = 1001;
		
		Order o2 = o1;//赋值以后，o1和o2地址值相同，都指向堆空间中同一个地址值
		
		System.out.println("o1.OrderID = " + o1.OrderID + "o2.OrderID = " + o2.OrderID);
		
		o2.OrderID = 1002;
		
		System.out.println("o1.OrderID = " + o1.OrderID + "o2.OrderID = " + o2.OrderID);
	}
	
	
}

class Order{
	
	int OrderID;
	
}
