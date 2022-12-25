package com.witstan.exer1;
/*
 * 请使用继承的思想，设计CommonEmployee类和Manager类，要求类 
中提供必要的方法进行属性访问。
 * 
 */
public class EmployeeTest {
	public static void main(String[] args) {
		Employee m1 = new Manager();
		m1.setId(1001);
		m1.setName("Tom");
		m1.setSalary(2000);
		m1.work();
		
		CommonEmployee c1 = new CommonEmployee();
		c1.setName("Tom");
		c1.work();
		

	}
}
