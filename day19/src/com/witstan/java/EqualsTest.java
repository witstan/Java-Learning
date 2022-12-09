package com.witstan.java;

import java.util.Date;

/*
 * 面试题： == 和 equals() 区别
 * 
 * 一、回顾 == 的使用：
 * == ： 运算符
 * 1. 可以使用在基本数据类型变量和引用数据类型变量的比较中
 * 2. 如果比较的是基本数据类型变量：比较两个基本数据类型保存的数据值是否相等（不一定类型要相同）
 *	      如果比较的是引用数据类型：比较的是两个引用数据类型的地址值是否相同，即两个引用数据类型是否指向同一个对象
 * 补充：== 符号使用时，必须保证左右两边数据类型一致。
 * 
 * 二、equals()方法的使用：
 * equals():方法
 * 1. 只能用于引用数据类型
 * 2. Object类中equals()的定义：
 *   public boolean equals(Object obj) {
        return (this == obj);
    }
             说明：Object类中的equals()方法和==的作用相同，比较两个对象的地址值是否相同，即两个引用是否指向同一个对象  
 * 
 * 3. String/Date/File/包装类等都重写了Object类中的equals()方法，重写以后
 * 比较的不是两个引用的地址是否相同，而是比较的两个对象的“实体内容”是否相同
 * 
 * 4. 通常情况下，自定义类如果使用equals(),也通常是希望比较两个对象的实体内容是否相同。
 * 需要对Object类中的equals()方法进行重写
 * 
 * 重写的原则：比较的两个对象的“实体内容”是否相同
 * 
 */
public class EqualsTest {
	public static void main(String[] args) {
		
		//基本数据类型
		int i = 10;
		int j = 10;
		double d = 10.0;
		System.out.println(i == j);
		System.out.println(i == d);
		
		boolean b = true;
//		System.out.println(i == b);
		
		char c = 10;
		System.out.println(i == c);
		
		char c1 = 'A';
		char c2 = 65;
		System.out.println(c1 == c2);
		
		//引用数据类型
		Customer cust1 = new Customer("Tom", 23);
		Customer cust2 = new Customer("Tom", 23);
		System.out.println(cust1 == cust2);
		
		String s1 = new String("AA");
		String s2 = new String("AA");
		System.out.println(s1 == s2);
		
		System.out.println("*******");
		System.out.println(cust1.equals(cust2));//false ---> true
		System.out.println(s1.equals(s2));//true
		
		Date d1 = new Date(234354354L);
		Date d2 = new Date(234354354L);
		System.out.println(d1.equals(d2));//true
		
		
		
	}
}
