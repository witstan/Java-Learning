package com.witstan.java1;
/*
 * JavaBean是一种Java语言写成的可重用组件。
所谓javaBean，是指符合如下标准的Java类：
 >类是公共的
 >有一个无参的公共的构造器
 >有属性，且有对应的get、set方法
 * 
 * 
 */
public class Customer {
	
	private int id;
	private String name;
	
	public Customer(){
		
	}
	
	 
	public void setId(int i){
		id = i;
	}
	
	public void setName(String s){
		name = s;
	}
	
	public int getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	

}
