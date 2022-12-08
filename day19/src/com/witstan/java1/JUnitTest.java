package com.witstan.java1;

import java.util.Date;

import org.junit.Test;

/*
 * Java中的JUnit单元测试
 * 
 * 	步骤：
 * 	1. 选中当前工程 - 右键选择：build path - add libraries - JUnit 4 - finish
 * 	2. 创建Java类，进行单元测试。
 * 		此时的Java类要求：① 此类是公共的 ② 此类要提供一个公共的无参构造器
 * 	3. 此类中声明单元测试方法
 * 		此时的单元测试方法： 方法的权限是public，没有返回值类型，没有形参
 * 	
 * 	4. 此单元测试方法上需要声明注解：@Test， 并在单元测试类中导入import org.junit.Test;
 * 
 * 	5. 声明好单元测试方法后，就可以在方法体内测试相关代码。
 * 	6. 代码完成后，左键双击单元测试方法名，右键：run as - JUnit Test
 * 
 * 	说明：
 * 	1. 如果执行结果没有任何异常：绿条
 * 	2. 如果执行结果有异常：红条
 * 	
 * 
 */
public class JUnitTest {
	
	int i = 10;
	
	@Test
	public void testEquals(){
		String s1 = "AA";
		String s2 = "AA";
		
		System.out.println(s1.equals(s2));
		
		//ClassCastException异常
		Object o = new String("BB");
		Date d = (Date)o;
		
		System.out.println(i);
	}
	
	@Test
	public void testToString(){
		String s2 = "bb";
		System.out.println(s2.toString());
	}
		
	
}
