package com.witstan.exer;
/*
 * (2)定义类Kids继承ManKind，并包括
 成员变量int yearsOld；
 方法printAge()打印yearsOld的值。
 * 
 */
public class Kids extends ManKind{
	
	int yearsOld;
	
	public Kids(){
		
	}
	
	public void printAge(){
		System.out.println(yearsOld);
	}
}
