package com.witstan.java;

public class Student extends Person{
	
//	String name;
//	int age;
	String major;
	
	public Student(){
		
	}
	
	public Student(String name, int age, String major){
		this.name = name;
		setAge(age);
		this.major = major;
	}
	
//	public void eat(){
//		System.out.println("eat");
//	}
//	
//	public void sleep(){
//		System.out.println("sleep");
//	}
	
	public void study(){
		System.out.println("study");
	}
	
	public void show(){
		System.out.println("name: " + name + ", age: " + this.getAge());
	}
	
}
