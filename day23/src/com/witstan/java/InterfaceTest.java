package com.witstan.java;
/*
 * 接口的使用
 * 1. 接口使用interface来定义
 * 2.Java中，接口和类是并列的结构
 * 3.如何定义接口：定义接口中的成员
 * 		
 * 		3.1 JDK7及以前：只能定义全局常量和抽象方法
 * 			> 全局常量： public static final的。书写时可以省略
 * 			> 抽象方法：public abstract的
 * 
 *  	3.2 JDK8：除了定义全局常量和抽象方法，还可以定义静态方法、默认方法（略）
 *  
 * 4.接口中不能定义构造器，意味着接口不可以实例化
 * 
 * 5.Java开发中，接口都通过让类去实现(implements)的方式来使用
 * 	 如果实现类覆盖了接口中的所有抽象方法，则此实现类可以实例化
 * 	 如果实现类没有覆盖所有的抽象方法，则此实现类仍为抽象类
 * 
 * 6.Java类可以实现多个接口 ---弥补了java单继承的局限性
 * 	 格式： class AA expands BB implements CC, DD, EE{}
 * 
 * 7.接口与接口之间可以多继承
 * 
 * *****************************************
 * 8.接口的使用体现多态性
 * 9.接口，实际上可以看作是一种规范
 * 
 * 面试题: 抽象类与接口有哪些异同?
 */
public class InterfaceTest {
	public static void main(String[] args) {
		System.out.println(Flyable.MAX_SPEED);
		System.out.println(Flyable.MIN_SPEED);
		
//		MIN_SPEED = 2;
		
		Plane p = new Plane();
		p.fly();
		p.stop();
		
		
		
	}
}
interface Attack{
	void attack();
}


interface Flyable{
	
	//全局常量
	public static final int MAX_SPEED = 7900;//第一宇宙速度
	int MIN_SPEED = 1;
	
	//抽象方法
	public abstract void fly();
	//省略了 public abstract
	void stop();
	
//	public Flyable(){//Interfaces cannot have constructors
//		
//	}
	
}

class Plane implements Flyable{

	@Override
	public void fly() {
		System.out.println("engine start");
		
	}

	@Override
	public void stop() {
		System.out.println("engine shut down");
	}
	
}

abstract class Kite implements Flyable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	
}

class Bullet extends Object implements Flyable, Attack, CC{

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		
	}
	
}
//*****************************************************

interface AA{
	void methodA();
}

interface BB{
	void methodB();
}

interface CC extends AA, BB{
	
}