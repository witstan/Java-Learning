package com.witstan.java8;
/*
 * JDK8：除了定义全局常量和抽象方法，还可以定义静态方法、默认方法（略）
 * 
 */
public interface CompareA {
	//静态方法
	public static void method1(){
		System.out.println("CompareA：北京");
	}
	
	//默认方法
	public default void method2(){
		System.out.println("CompareA：上海");
	}
	
	//默认方法
	default void method3(){
		System.out.println("CompareA：南京");
	}
}
