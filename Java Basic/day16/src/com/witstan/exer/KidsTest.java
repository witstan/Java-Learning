package com.witstan.exer;
/*
 * (3)定义类KidsTest，在类的main方法中实例化Kids的对象someKid，用该对象访问 
其父类的成员变量及方法。
 * 
 */
public class KidsTest {
	public static void main(String[] args) {
		Kids someKid = new Kids();
		someKid.salary = 5;
		someKid.employeed();
		
		someKid.sex = 0;
		someKid.manOrWoman();
		
		someKid.yearsOld = 3;
		someKid.printAge();
	}
}
