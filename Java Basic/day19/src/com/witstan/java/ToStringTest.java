package com.witstan.java;

import java.util.Date;

/*
 * Object类中toString()的使用，
 * 
 * 1. 当输出一个对象的引用，实际上就是调用当前对象的toString()
 * 
 * 2. Object类中toString()的定义：
 * 		public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
 * 
 * 3. String/Date/File/包装类等都重写了Object类中toString()方法。
 * 	   使得在调用对象的toString()时，返回对象的“实体内容”
 * 
 * 4. 自定义类也可以重写toString()方法，当调用方法时，返回对象的“实体内容”
 */
public class ToStringTest {
	public static void main(String[] args) {
		
		Customer cust1 = new Customer("Tom", 23);
		System.out.println(cust1.toString());//com.witstan.java.Customer@15db9742
		System.out.println(cust1);//com.witstan.java.Customer@15db9742
		
		String s = new String("123");
		System.out.println(s);//123
		
		Date d = new Date(893458374L);
		System.out.println(d.toString());//Sun Jan 11 16:10:58 CST 1970
		
		
	}
}
