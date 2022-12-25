package com.witstan.java;

public class Person extends Creature{
	
	String name;
	private int age;
	
	public Person(){
		
	}
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void eat(){
		sleep();
		System.out.println("eat");
	}
	
	private void sleep(){
		System.out.println("sleep");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
