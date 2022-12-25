package com.witstan.java3;

public class Person {
	
	String name;
	int age = 10;
	int id = 1001;
	
	public Person(){
		
	}
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void eat(){
		System.out.println("eat");
	}
	
	public void walk(){
		System.out.println("have been walking");
	}
	
}