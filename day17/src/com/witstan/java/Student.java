package com.witstan.java;

public class Student extends Person{
	
	String major;
	
	public Student(){
		
	}
	
	public Student(String major){
		this.major = major;
	}
	
	public void study(){
		System.out.println("study");
	}
	
	//对父类中的eat方法进行重写
	public void eat(){
		System.out.println("eat more");
	}
	
	public void show(){
		System.out.println("a student");
	}
	
	public String info(){
		return null;
	}
	
//	public int info1(){
//		return 1;
//	}
	
//	public void walk(int distance){
//		System.out.println("重写的方法");
//	}
	
	@Override
	public void walk(int distance) {
		System.out.println("重写的方法2");
	}
	
}
