package com.witstan.java1;

/*
 * 关于包装类使用的面试题
 * 
 */
import org.junit.Test;

public class InterviewTest {

	@Test
	public void test1() {
		Object o1 = true ? new Integer(1) : new Double(2.0);
		System.out.println(o1);// 1.0

	}

	@Test
	public void test2() {
		Object o2;
		if (true)
			o2 = new Integer(1);
		else
			o2 = new Double(2.0);
		System.out.println(o2);// 1
	}

	@Test
	public void test3() { 
		Integer i = new Integer(1); 
		Integer j = new Integer(1); 
		System.out.println(i == j);//false
		
		//Integer内部定义了IntegerCache结构，IntegerCache种定义了Integer[],
		//保存了从-128~127范围内的整数。如果使用了自动装箱的方式给Integer赋值的范围在
		//-128~127范围内时，可以直接使用数组中的元素，不用再去new了，提高了效率
		
		Integer m = 1; 
		Integer n = 1;
		System.out.println(m == n);//true
		
		Integer x = 128;
		Integer y = 128;
		System.out.println(x == y);//false
		}
}


