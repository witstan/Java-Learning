package com.witstan.java2;

public class Person {

	String name;
	int age;
	int id = 1001;//身份证号
	
	public Person(){
		System.out.println("everywhere");
	}
	
	public Person(String name){
		this.name = name;
	}
	
	public Person(String name, int age){
		this(name);
		this.age = age;
	}
	
	public void eat(){
		System.out.println("eat");
	}
	
	public void walk(){
		System.out.println("have been walking");
	}
}
