package com.witstan.java;

import org.junit.Test;

public class ReviewTest {
	

	//关于toString()
	@Test
	public void test3(){
		
		String s = "a";
		s = null;
		System.out.println(s);//null
		System.out.println("***");
		System.out.println(s.toString());//NullPointerException
	}
	
	
	//区别手动和自动重写equals()
	@Test
	public void test2(){
		Person p1 = new Person("Tom", 12);
		Man m1 = new Man("Tom", 12);
		
		System.out.println(p1.equals(m1));
	}
	
	
	
	//数组也作为Object类的子类，可以调用Object类中声明的方法
	@Test
	public void test1(){
		int[] arr = new int[]{1,2};
		print(arr);
		
		System.out.println(arr.getClass().getSuperclass());
	}
	
	public void print(Object obj){
		System.out.println(obj);
	}
}


