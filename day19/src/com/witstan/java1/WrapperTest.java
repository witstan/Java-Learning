package com.witstan.java1;

import org.junit.Test;

/*
 * 包装类的使用：
 * 1. java提供了8种基本数据类型对应的包装类，是的基本数据类型的变量具有类的特征
 * 
 * 2. 掌握：基本数据类型、包装类、String三者的转换
 * 
 * 
 */
public class WrapperTest {
	
	//String类型 --->基本数据类型、包装类:调用包装类的parseXxx()
	@Test
	public void test5(){
		String s1 = "0123";
		//错误的情况
//		int num1 = (int)s1;
//		Integer in1 = (Integer)s1;
		
		int num2 = Integer.parseInt(s1);
		System.out.println(num2 + 1);
		
		String s2 = "true";
		boolean b1 = Boolean.parseBoolean(s2);
		System.out.println(b1);
		
		
		
	}
	
	
	//基本数据类型/包装类 --->String类型
	@Test
	public void test4(){
		
		int num1 = 10;
		
		//方式一：连接运算
		String s1 = num1 + "";
		//方式二：调用String的valueOf()
		float f1 = 1.23f;
		String s2 = String.valueOf(f1);
		System.out.println(s2);
		
		Double d1 = new Double(1.24);
		//double d2 = d1;
		String s3 = String.valueOf(d1);
		System.out.println(s3);
		
	}
	
	
	/*
	 * JDK5.0:新特性：自动装箱与自动拆箱
	 */
	@Test
	public void test3(){
//		int num1 = 10;
//		//基本数据类型 --->包装类的对象
//		method(num1);
		
		//自动装箱：基本数据类型 --->包装类
		int num2 = 10;
		Integer in1 = num2;//自动装箱
		
		boolean b1 = true;
		Boolean b2 = b1;//自动装箱
		
		//自动拆箱：包装类 --->基本数据类型
		System.out.println(in1.toString());
		
		
		int num3 = in1;//自动拆箱
		
		
	}
	
	public void method(Object obj){
		System.out.println(obj);
	}
	
	
	
	
	//包装类 --->基本数据类型：调用包装类的xxxValue()
	@Test
	public void test2(){
		
		Integer in1 = new Integer(12);
		int i = in1.intValue();
		System.out.println(i + 1);
		
		Float f1 = new Float(1.23);
		float f = f1.floatValue();
		System.out.println(f);
	}
	
	
	
	//基本数据类型 --->包装类：调用包装类的构造器
	@Test
	public void test1(){
		
		int num1 = 10;
		System.out.println();
		Integer in1 = new Integer(num1);
		System.out.println(in1.toString());
		
		Integer in2 = new Integer("123");
		System.out.println(in2.toString());
		
//		Integer in2 = new Integer("123aba");
//		System.out.println(in2.toString());
		
		Float f1 = new Float(12.4f);
		Float f2 = new Float("12.4");
		System.out.println(f1);
		System.out.println(f2.toString());
		
		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean("TRue");
		System.out.println(b2);
		Boolean b3 = new Boolean("true445");
		System.out.println(b3.toString());//false
		
		Order o = new Order();
		System.out.println(o.isMale);
		System.out.println(o.isFemale);
	}
	
	
	
}

class Order{
	
	boolean isMale;
	Boolean isFemale;
}