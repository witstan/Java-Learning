package com.witstan.exer;

/*
 * (2)定义类Kids继承ManKind，并包括
 成员变量int yearsOld；
 方法printAge()打印yearsOld的值。
 * 
 */
public class Kids extends ManKind {

	int yearsOld;

	public Kids() {

	}

	public void printAge() {
		System.out.println(yearsOld);
	}

	/*
	 * 修改练习1.2中定义的类Kids，在Kids中重新定义employeed()方
	 * 法，覆盖父类ManKind中定义的employeed()方法，输出“Kids should study and no job.”
	 */

	public void employeed() {
		System.out.println("Kids should study and no job.");
	}
}
