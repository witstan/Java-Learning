package com.witstan.java2;
/*
 * 单例懒汉式实现
 * 
 */
public class SingletonTest2 {
	public static void main(String[] args) {
		
		Order o1 = Order.getInstance();
		Order o2 = Order.getInstance();
		System.out.println(o1 == o2);
	}
}


//懒汉式
class Order{
	
	//1.私有化类的构造器
	private Order(){
		
	}
	
	//2.声明当前对象，没有初始化；
	//4.此对象也必须声明为static的
	private static Order instance = null;
	
	//3.声明public、static的返回当前对象的方法
	public static Order getInstance(){
		if(instance == null){
			instance = new Order();
		}
		return instance;
	}
}