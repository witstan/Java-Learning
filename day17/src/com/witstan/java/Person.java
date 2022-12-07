package com.witstan.java;

public class Person {
	
	String name;
	int age;
	
	public Person(){
		
	}
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void eat(){
		System.out.println("eat");
	}
	
	public void walk(int distance){
		System.out.println("have been walking for " + distance + " meters");
		show();
	}
	
	private void show(){
		System.out.println("a person");
	}
	
	public Object info(){
		return null;
	}
	
	public double info1(){
		return 1.0;
	}
	
	
}
